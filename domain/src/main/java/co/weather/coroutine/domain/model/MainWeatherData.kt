package co.weather.coroutine.domain.model

import co.weather.coroutine.domain.model.weatherdata.*
import kotlinx.parcelize.Parcelize
import java.io.Serializable



data class MainWeatherData(
    var id : Int?= -1,

    var cloud : Cloud? = Cloud(),

    var cord : Cord? = Cord(),

    var mainTemp : MainTemp? = MainTemp(),

    var weather : List<Weather>? = listOf(),

    var weatherSystem: WeatherSystem? = WeatherSystem(),

    var wind: Wind?= Wind(),

    var dateTime: Long? =1,
    var name : String?="",
    var cod : Int?=1

):Serializable {

}
