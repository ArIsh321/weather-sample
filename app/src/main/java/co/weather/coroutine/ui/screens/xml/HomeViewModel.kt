package co.weather.coroutine.ui.screens.xml


import androidx.lifecycle.viewModelScope
import co.weather.coroutine.domain.model.ForeCastList
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.domain.model.weatherdata.Weather
import co.weather.coroutine.domain.usecase.UseCase
import co.weather.coroutine.domain.usecase.UseCaseResult
import co.weather.coroutine.ui.base.BaseViewModel
import co.weather.coroutine.ui.base.NavigationEvent
import co.weather.coroutine.util.DispatchersProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

interface Input {
    fun getWeatherByLocation(latitude: Double, longitude: Double)
    val weatherData: StateFlow<MainWeatherData>
    val cityWeather: StateFlow<MainWeatherData>
    val forecastData: StateFlow<Weather>
    val forecastDetail: StateFlow<ForeCastList>
}

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCase: UseCase,
    dispatchers: DispatchersProvider
) : BaseViewModel(dispatchers), Input {

    val input: Input = this

    private val _weatherData = MutableStateFlow(MainWeatherData())
    override val weatherData: StateFlow<MainWeatherData>
        get() = _weatherData

    private val _cityWeather = MutableStateFlow(MainWeatherData())
    override val cityWeather: StateFlow<MainWeatherData>
        get() = _cityWeather

    private val _forecastData = MutableStateFlow(Weather())
    override val forecastData: StateFlow<Weather>
        get() = _forecastData

    private val _forecastDetail= MutableStateFlow(ForeCastList())
    override val forecastDetail: StateFlow<ForeCastList>
        get() = _forecastDetail

    override fun getWeatherByLocation(latitude: Double, longitude: Double) {
        execute {
            when (val result = useCase.executeWeather(latitude,longitude)) {
                is UseCaseResult.Success -> {
                    _forecastData.value = result.data.weather!![0]
                    _weatherData.emit(result.data)
                }
                is UseCaseResult.GenericError ->{
                    _error.emit(result.error.message!!)
                }
                is UseCaseResult.Error -> {
                    val errorMessage = result.exception.message.orEmpty()
                    _error.emit(errorMessage)
                }
            }
        }
    }

    fun onSearchText(cityName: String) {
        execute {
            when (val result = useCase.executeCityWeather(cityName)) {
                is UseCaseResult.Success -> {
                    _cityWeather.value = result.data
                    navigateToCityWeather(_cityWeather.value)
                }
                is UseCaseResult.GenericError ->{

                }
                is UseCaseResult.Error -> {
                    _error.emit("City not found")
                }
            }
        }
    }

    private fun navigateToCityWeather(data: MainWeatherData) {
        viewModelScope.launch {
            _navigator.emit(NavigationEvent.CityWeather(data))
        }

    }

    fun foreCastList(latitude: Double, longitude: Double) {
        execute {
            when (val result = useCase.executeForeCastList(latitude,longitude)) {
                is UseCaseResult.Success -> {
                    _forecastDetail.value = result.data
                }
                is UseCaseResult.Error -> {
                    val errorMessage = result.exception.message.orEmpty()
                    _error.emit(errorMessage)
                }
            }
        }
    }


}

