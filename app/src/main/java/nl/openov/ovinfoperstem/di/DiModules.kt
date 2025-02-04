package nl.openov.ovinfoperstem.di

import dev.jordond.compass.geocoder.Geocoder
import dev.jordond.compass.geocoder.mobile
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import nl.openov.ovinfoperstem.util.LocationPermissionHelper
import nl.openov.ovinfoperstem.viewmodel.HomeViewModel
import org.koin.core.module.dsl.viewModelOf

fun appModule() = module {
    factory { Geocoder.mobile() }

    singleOf(::LocationPermissionHelper)

    viewModelOf(::HomeViewModel)
}