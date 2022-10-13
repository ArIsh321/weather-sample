package co.weather.coroutine.ui.base

import co.weather.coroutine.domain.model.MainWeatherData

sealed class NavigationEvent {
    object PopBackStack : NavigationEvent()
    data class CityWeather(val weather: MainWeatherData) : NavigationEvent()
}
