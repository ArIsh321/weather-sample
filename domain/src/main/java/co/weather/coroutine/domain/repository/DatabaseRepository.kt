package co.weather.coroutine.domain.repository

import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.domain.model.weatherdata.WeatherSystem


interface DatabaseRepository {
    suspend fun insertUserData(value: WeatherSystem): Long
}