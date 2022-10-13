package co.weather.coroutine.data.response

import co.weather.coroutine.domain.model.weatherdata.Wind
import com.squareup.moshi.Json

data class WindResponse(
    @Json(name = "speed") val speed: Double?,
    @Json(name = "deg") val deg: Int?

){
    fun toWindData(): Wind{
        return Wind(
            speed = this.speed,
        deg = this.deg
        )}
}
