package co.selfdrive.demo.domain.repository

import co.selfdrive.demo.domain.model.ForeCastList
import co.selfdrive.demo.domain.model.MainWeatherData
import co.selfdrive.demo.domain.model.Model


interface Repository {

    suspend fun getModels(): List<Model>

   suspend fun getWeatherByLocation(params: MutableMap<String, String>): MainWeatherData

   suspend fun getCityWeather(params: MutableMap<String, String>): MainWeatherData

   suspend fun getForecastWeather(params: MutableMap<String, String>): ForeCastList
}
