package co.selfdrive.demo.data.repository.entity
import co.selfdrive.demo.domain.model.weatherdata.*
import java.io.Serializable


data class UserData(
    val id : Int?= -1,
    val cloud : Cloud? = Cloud(),
    var weather : List<Weather>? = listOf(),
    val weatherSystem: WeatherSystem? = WeatherSystem(),
    val wind: Wind?= Wind(),
    val dateTime: Long? =1,
    val name : String?="",
    val cod : Int?=1
):Serializable
