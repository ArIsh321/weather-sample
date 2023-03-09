package co.selfdrive.demo.domain.model

import co.selfdrive.demo.domain.model.weatherdata.*
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
