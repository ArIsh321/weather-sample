package co.weather.coroutine.util.extension

import android.widget.TextView
import androidx.databinding.BindingAdapter
import co.weather.coroutine.R
import org.w3c.dom.Text
import java.util.*

@BindingAdapter("wind")
fun provideWind(view : TextView,wind: String) {
    view.text =
        String.format(Locale.getDefault(),view.context.getString(R.string.wind_unit_label),wind.toDouble())
}


@BindingAdapter("humidity")
fun provideHumidity(view : TextView,humidity: String) {
    view.text = String.format(Locale.getDefault(), "%d%%",humidity.toInt() )

}

@BindingAdapter("temperature")
fun  provideTemperature(view : TextView,tem: String) {
    view.text = String.format(Locale.getDefault(),"%.0f°",tem.toDouble())
}

@BindingAdapter("date")
fun  provideDate(view : TextView,item: String) {
    view.text = item.isTime()

}
