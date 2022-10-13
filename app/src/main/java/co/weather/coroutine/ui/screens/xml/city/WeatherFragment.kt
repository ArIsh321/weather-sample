package co.weather.coroutine.ui.screens.xml.city

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import co.weather.coroutine.databinding.FragmentCityWeatherBinding
import co.weather.coroutine.databinding.ViewLoadingBinding
import co.weather.coroutine.domain.model.ForeCastList
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.extension.provideViewModels
import co.weather.coroutine.ui.base.BaseFragment
import co.weather.coroutine.ui.screens.MainNavigator
import co.weather.coroutine.ui.screens.xml.ForecastAdapter
import co.weather.coroutine.util.extension.isDate
import co.weather.coroutine.util.extension.milliToStringTime
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class WeatherFragment : BaseFragment<FragmentCityWeatherBinding>() {

    @Inject
    lateinit var navigator: MainNavigator

    private val viewModel: WeatherViewModel by provideViewModels()

    private lateinit var forecastAdapter: ForecastAdapter

    private lateinit var viewLoadingBinding: ViewLoadingBinding

    private val args: WeatherFragmentArgs by navArgs()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentCityWeatherBinding
        get() = { inflater, container, attachToParent ->
            FragmentCityWeatherBinding.inflate(inflater, container, attachToParent)
        }

    override fun setupView() {
        binding.viewModel = viewModel
        viewLoadingBinding = ViewLoadingBinding.bind(binding.root)
        this@WeatherFragment.viewModel.initData(args.weatherData)
        with(binding) {
            toolbar.setNavigationOnClickListener {
                this@WeatherFragment.viewModel.navigationBack()
            }
            contentMainLayout.tvWeatherUpdate.isVisible = false
            contentMainLayout.lvButton.isVisible = true
            contentMainLayout.btnViewMore.setOnClickListener {
                        viewLoadingBinding.pbLoading.isVisible = true
                this@WeatherFragment.viewModel.foreCastList()
            }
//            contentMainLayout.btnAddToFav.setOnClickListener {
//                this@WeatherFragment.viewModel.insertUserInfo()
//            }
            contentMainLayout.tvDate.text = args.weatherData.dateTime.toString().isDate()


            setupDataList()
        }
    }

    private fun setupDataList() {
        with(binding.contentMainLayout.rvForecastView) {
            adapter = ForecastAdapter().also { forecastAdapter = it }
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }
    }

    override fun bindViewModel() {
        viewModel.weatherData bindTo ::displayUiModels
        viewModel.error bindTo toaster::display
        viewModel.navigator bindTo navigator::navigate
        viewModel.forecastDetail bindTo ::bindData
    }

    private fun bindData(foreCastList: ForeCastList) {
        with(forecastAdapter) {
            if (foreCastList.weatherDataList!!.isNotEmpty()) {
                viewLoadingBinding.pbLoading.isVisible = false
                items = foreCastList.weatherDataList!!.toMutableList()
            }
        }
    }

    private fun displayUiModels(uiModels: MainWeatherData) {
        binding.item = uiModels
        with(binding) {
            contentMainLayout.tvDate.text = uiModels.dateTime?.let { milliToStringTime(it) }
            contentMainLayout.tvTemp.text = String.format("%.1f",
                uiModels.mainTemp?.tempMax?.toInt()?.minus(273.15)?.toDouble()) + "°C"

            if (uiModels.weather!!.isNotEmpty()) {
                contentMainLayout.tvDescription.text = uiModels.weather!![0].description
            }
            Glide.with(requireActivity())
                .load(this@WeatherFragment.viewModel.input.forecastImg.value.getForeCastIcon())
                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
                .into(contentMainLayout.imgView)
        }
    }
}
