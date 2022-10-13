package co.weather.coroutine.data.response

import co.weather.coroutine.domain.model.weatherdata.WeatherSystem
import com.squareup.moshi.Json

data class WeatherSystemResponse (
    @Json(name = "type") val type: Int?,
    @Json(name = "id") val id: Int?,
    @Json(name = "country") val country: String?,
    @Json(name = "sunrise") val sunrise: Long?,
    @Json(name = "sunset") val sunset: Long?,
){
    fun toSystemResponse () : WeatherSystem{
        return WeatherSystem(
            type = this.type,
            id = this.id,
            country = this.country,
            sunrise = this.sunrise,
            sunset = this.sunset
        )
    }
}