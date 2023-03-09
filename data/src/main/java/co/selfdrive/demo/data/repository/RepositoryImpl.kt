package co.selfdrive.demo.data.repository

import co.selfdrive.demo.data.response.toModels
import co.selfdrive.demo.data.service.ApiService
import co.selfdrive.demo.domain.model.ForeCastList
import co.selfdrive.demo.domain.model.MainWeatherData
import co.selfdrive.demo.domain.model.Model
import co.selfdrive.demo.domain.repository.Repository


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
