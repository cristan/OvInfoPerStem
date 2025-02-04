package nl.openov.ovinfoperstem.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.jordond.compass.Coordinates
import dev.jordond.compass.geolocation.Geolocator
import dev.jordond.compass.geolocation.mobile
import dev.jordond.compass.permissions.LocationPermissionController
import dev.jordond.compass.permissions.mobile
import kotlinx.coroutines.launch
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
            }
        }
//        else {
//            onReturnedToScreen()
//        }
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