package co.weather.coroutine.data.response

import co.weather.coroutine.domain.model.weatherdata.Cord
import com.squareup.moshi.Json

data class CordResponse (
    @Json(name = "lon") val lon : Double?,
    @Json(name = "lat") val lat : Double?,
    )
{
fun toCord() : Cord {
    return Cord(
        lon = this.lon,
        lat = this.lat
)
}
}