package co.selfdrive.demo.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import co.selfdrive.demo.domain.model.weatherdata.WeatherSystem

@Dao
interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertToRoomDatabase(user: WeatherSystem) : Long
}