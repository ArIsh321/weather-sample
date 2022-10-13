package co.weather.coroutine.data.response

import co.weather.coroutine.domain.model.weatherdata.MainTemp
import com.squareup.moshi.Json

data class MainDataResponse(
    @Json(name = "temp") val temp: Float?,
    @Json(name = "feels_like") val feelsLike: Float?,
    @Json(name = "temp_min") val tempMin: Float?,
    @Json(name = "temp_max") val tempMax: Float?,
    @Json(name = "pressure") val pressure: Int?,
    @Json(name = "humidity") val humidity: Int?,
){
    fun toMainData() : MainTemp{
        return MainTemp(
            temp = this.temp,
            feelsLike = this.feelsLike,
            tempMin = this.tempMin,
            tempMax = this.tempMax,
            pressure  = this.pressure,
            humidity = this.humidity
        )
    }
}
