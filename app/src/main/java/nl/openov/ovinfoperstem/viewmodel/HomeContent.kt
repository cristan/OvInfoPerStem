package nl.openov.ovinfoperstem.viewmodel

sealed class HomeContent {
    data object RequireGpsPermission : HomeContent()

    data object Main : HomeContent()
}