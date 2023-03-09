package co.selfdrive.demo.domain.model.weatherdata

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class Weather(
    val id: Int? = 0,
    val main: String? = "",
    val description: String? = "",
    val icon: String? = ""
) : Serializable,Parcelable
{
    fun getForeCastIcon(): String {
        return "http://openweathermap.org/img/wn/$icon.png"
    }
}
