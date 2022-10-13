package co.weather.coroutine.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import co.weather.coroutine.domain.model.weatherdata.WeatherSystem

@Dao
interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertToRoomDatabase(user: WeatherSystem) : Long
}