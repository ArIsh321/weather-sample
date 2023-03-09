package co.selfdrive.demo.domain.repository

import co.selfdrive.demo.domain.model.weatherdata.WeatherSystem


interface DatabaseRepository {
    suspend fun insertUserData(value: WeatherSystem): Long
}