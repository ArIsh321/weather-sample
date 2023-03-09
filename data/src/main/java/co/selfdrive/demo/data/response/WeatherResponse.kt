package co.selfdrive.demo.data.response

import co.selfdrive.demo.domain.model.weatherdata.Weather
import com.squareup.moshi.Json

data class WeatherResponse (
    @Json(name = "id") val id: Int?=0,
    @Json(name = "main") val main: String? ="",
    @Json(name = "description") val description: String? ="",
    @Json(name = "icon") val icon: String? = ""
)
{
    fun toWeather() : Weather{
        return Weather(
            id = this.id,
            main = this.main,
            description = this.description,
            icon = this.icon
        )
    }

}

