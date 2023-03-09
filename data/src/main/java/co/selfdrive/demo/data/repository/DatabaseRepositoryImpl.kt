package co.selfdrive.demo.data.repository

import android.content.Context
import co.selfdrive.demo.data.database.WeatherDatabase
import co.selfdrive.demo.domain.model.weatherdata.WeatherSystem
import co.selfdrive.demo.domain.repository.DatabaseRepository


class DatabaseRepositoryImpl(private val context: Context, private val database: WeatherDatabase) :
    DatabaseRepository {

    override suspend fun insertUserData(data: WeatherSystem): Long {
        return database.weatherDao().insertToRoomDatabase(data)
    }
}
