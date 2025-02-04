package nl.openov.ovinfoperstem.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.jordond.compass.Location
import dev.jordond.compass.geolocation.Geolocator
import dev.jordond.compass.geolocation.mobile
import kotlinx.coroutines.launch

class HomeViewModel(
) : ViewModel() {

    private val _location = mutableStateOf<Location?>(null)
    val location: State<Location?> = _location

    fun onLoadLocationClicked() {
        viewModelScope.launch {
            loadLocation()
        }
    }

    suspend fun loadLocation() {
        val geolocator: Geolocator = Geolocator.mobile()
        _location.value = geolocator.current().getOrNull()
    }
}