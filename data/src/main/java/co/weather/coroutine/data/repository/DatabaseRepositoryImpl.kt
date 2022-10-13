package co.weather.coroutine.data.repository

import android.content.Context
import co.weather.coroutine.data.database.WeatherDatabase
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.domain.model.weatherdata.WeatherSystem
import co.weather.coroutine.domain.repository.DatabaseRepository


class DatabaseRepositoryImpl(private val context: Context, private val database: WeatherDatabase) :
    DatabaseRepository {

    override suspend fun insertUserData(data: WeatherSystem): Long {
        return database.weatherDao().insertToRoomDatabase(data)
    }
}
