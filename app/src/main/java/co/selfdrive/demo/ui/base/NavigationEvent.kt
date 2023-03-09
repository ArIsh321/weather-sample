package co.selfdrive.demo.ui.base

import co.selfdrive.demo.domain.model.MainWeatherData

sealed class NavigationEvent {
    object PopBackStack : NavigationEvent()
    data class CityWeather(val weather: MainWeatherData) : NavigationEvent()
}
