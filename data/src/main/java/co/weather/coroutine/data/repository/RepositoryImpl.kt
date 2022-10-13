package co.weather.coroutine.data.repository

import co.weather.coroutine.data.response.toModels
import co.weather.coroutine.data.service.ApiService
import co.weather.coroutine.domain.model.ForeCastList
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.domain.model.Model
import co.weather.coroutine.domain.repository.Repository


class RepositoryImpl constructor(
    private val apiService: ApiService
) : Repository {

    override suspend fun getModels(): List<Model> = apiService.getResponses().toModels()

    override suspend fun getWeatherByLocation(params: MutableMap<String, String>): MainWeatherData =
        apiService.getLocationWeather(params).toWeatherData()

    override suspend fun getCityWeather(params: MutableMap<String, String>): MainWeatherData =
        apiService.getLocationWeather(params).toWeatherData()

    override suspend fun getForecastWeather(params: MutableMap<String, String>): ForeCastList =
        apiService.getForecastWeather(params).toForecastList()
}
