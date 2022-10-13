package co.weather.coroutine.domain.repository

import co.weather.coroutine.domain.model.ForeCastList
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.domain.model.Model


interface Repository {

    suspend fun getModels(): List<Model>

   suspend fun getWeatherByLocation(params: MutableMap<String, String>): MainWeatherData

   suspend fun getCityWeather(params: MutableMap<String, String>): MainWeatherData

   suspend fun getForecastWeather(params: MutableMap<String, String>): ForeCastList
}
