package co.weather.coroutine.ui.screens.xml

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import co.weather.coroutine.databinding.ItemForecastListBinding
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.domain.model.weatherdata.Weather
import co.weather.coroutine.ui.common.ItemClickable
import co.weather.coroutine.ui.common.ItemClickableImpl
import co.weather.coroutine.util.extension.isDate
import kotlinx.android.extensions.LayoutContainer
import java.util.*


@SuppressLint("NotifyDataSetChanged")
internal class ForecastAdapter() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    ItemClickable<ForecastAdapter.OnItemClick> by ItemClickableImpl() {
    var items = mutableListOf<MainWeatherData?>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        return ViewHolderItem(ItemForecastListBinding.inflate(inflate, parent, false))
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ForecastAdapter.ViewHolderItem -> {
                holder.bind(items[position])
            }
        }
    }

    internal inner class ViewHolderItem(
        private val binding: ItemForecastListBinding,
    ) : RecyclerView.ViewHolder(binding.root), LayoutContainer {
        override val containerView: View get() = itemView

        fun bind(model: MainWeatherData?) {
            model?.let { data ->
                with(binding) {
                    item = data
                    tvTemp.text = String.format("%.1f",data.mainTemp?.tempMax?.toInt()?.minus(273.15)?.toDouble())+"°C"
                    tvDate.text = data.dateTime.toString().isDate()
                }
            }
        }
    }

    sealed class OnItemClick {

    }

}
