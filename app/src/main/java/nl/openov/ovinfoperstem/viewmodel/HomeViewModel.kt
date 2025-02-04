package nl.openov.ovinfoperstem.viewmodel

import PingServiceClient
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.connectrpc.ProtocolClientConfig
import com.connectrpc.extensions.GoogleJavaProtobufStrategy
import com.connectrpc.impl.ProtocolClient
import com.connectrpc.okhttp.ConnectOkHttpClient
import com.connectrpc.protocols.NetworkProtocol
import dev.jordond.compass.Coordinates
import dev.jordond.compass.geolocation.Geolocator
import dev.jordond.compass.geolocation.mobile
import dev.jordond.compass.permissions.LocationPermissionController
import dev.jordond.compass.permissions.mobile
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import timber.log.Timber

class HomeViewModel(
) : ViewModel() {

    private val _coordinates = mutableStateOf<Coordinates?>(null)
    val coordinates: State<Coordinates?> = _coordinates

    private val _content = mutableStateOf(
        getInitialHomeContent()
    )

    fun onScreenLaunched() {
        Timber.d("screenLaunched called ${System.currentTimeMillis()}")
        if (content.value is HomeContent.Main) {
            viewModelScope.launch {
                loadLocation()
                subscribeToProtobuf()
            }
        }
//        else {
//            onReturnedToScreen()
//        }
    }

    private suspend fun subscribeToProtobuf() {
        Timber.d("subscribeToProtobuf: called at ${System.currentTimeMillis()}")
        val client = ProtocolClient(
            httpClient = ConnectOkHttpClient(OkHttpClient()),
            ProtocolClientConfig(
                host = "http://86.93.34.246:9990/",
                serializationStrategy = GoogleJavaProtobufStrategy(),
                networkProtocol = NetworkProtocol.CONNECT,
            ),
        )
        val pingServiceClient = PingServiceClient(client)
        val response =
            pingServiceClient.serviceAvailable(PingServiceOuterClass.Ping.newBuilder().setMessage("Ping").build())
        response.success {
            Timber.d("subscribeToProtobuf: retrieved message ${it.message.message}")
        }
        response.failure { failure ->
            Timber.e( "subscribeToProtobuf: failure with code ${failure.cause.code} ${failure.cause.cause}")
        }
    }

    private fun getInitialHomeContent() =
        if (LocationPermissionController.mobile()
                .hasPermission()
        ) HomeContent.Main else HomeContent.RequireGpsPermission

    val content: State<HomeContent> = _content

    fun onLoadLocationClicked() {
        viewModelScope.launch {
            loadLocation()
        }
    }

    private suspend fun loadLocation() {
        val geolocator: Geolocator = Geolocator.mobile()
        val loadedLocation = geolocator.current().getOrNull()
        _coordinates.value = loadedLocation?.coordinates
        if (loadedLocation != null) {
            _content.value = HomeContent.Main
        }
    }
}