package co.weather.coroutine.data.response

import androidx.room.Entity
import co.weather.coroutine.domain.model.MainWeatherData
import com.squareup.moshi.Json


@Entity(tableName = "weather_data")
data class WeatherDataResponse (
    @Json(name = "coord") val cord: CordResponse?,
    @Json(name = "weather") val weather: List<WeatherResponse>?,
    @Json(name = "base") val base: String?,
    @Json(name = "main") val main: MainDataResponse?,
    @Json(name = "visibility") val visibility: Int?,
    @Json(name = "wind") val wind: WindResponse?,
    @Json(name = "cloud") val cloud: CloudResponse?,
    @Json(name = "dt") val dateTime: Long?,
    @Json(name = "sys") val systemResponse: WeatherSystemResponse?,
    @Json(name = "timezone") val timezone: Int?,
    @Json(name = "id") val id: Int?,
    @Json(name = "name") val name: String?,
    @Json(name = "cod") val code: Int?
){

    fun toWeatherData() : MainWeatherData{
        return MainWeatherData(
            cord = this.cord?.toCord(),
            weather = this.weather?.map { it.toWeather() },
            mainTemp = this.main?.toMainData(),
            wind = this.wind?.toWindData(),
            cloud = this.cloud?.toCloud(),
            dateTime = this.dateTime,
            weatherSystem = this.systemResponse?.toSystemResponse(),
            id = this.id,
            name = this.name,
            cod = this.code
        )
    }
}