package co.selfdrive.demo.domain.model.weatherdata

import androidx.room.Entity
import androidx.room.PrimaryKey
import co.selfdrive.demo.domain.model.weatherdata.WeatherSystem.Companion.CITY_WEATHER

@Entity(tableName = CITY_WEATHER)
data class WeatherSystem(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = 0,
    val type: Int? = 0,
    val country: String? = "",
    val sunrise: Long? = 1,
    val sunset: Long? = 1,
){
    companion object {
        const val CITY_WEATHER = "city_weather"
    }
}
