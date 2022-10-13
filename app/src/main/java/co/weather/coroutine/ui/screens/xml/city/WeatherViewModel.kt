package co.weather.coroutine.ui.screens.xml.city


import androidx.lifecycle.viewModelScope
import co.weather.coroutine.data.repository.entity.UserData
import co.weather.coroutine.domain.model.ForeCastList
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.domain.model.weatherdata.Weather
import co.weather.coroutine.domain.usecase.DatabaseCaseResult
import co.weather.coroutine.domain.usecase.DatabaseUseCase
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
    val weatherData: StateFlow<MainWeatherData>
    val forecastImg: StateFlow<Weather>
    val forecastDetail: StateFlow<ForeCastList>
}

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val useCase: UseCase,
    dispatchers: DispatchersProvider,
    private val databaseUseCase: DatabaseUseCase,
) : BaseViewModel(dispatchers), Input {

    val input: Input = this

    private val _weatherData = MutableStateFlow(MainWeatherData())
    override val weatherData: StateFlow<MainWeatherData>
        get() = _weatherData

    private val _forecastImg = MutableStateFlow(Weather())
    override val forecastImg: StateFlow<Weather>
        get() = _forecastImg

    private val _forecastDetail = MutableStateFlow(ForeCastList())
    override val forecastDetail: StateFlow<ForeCastList>
        get() = _forecastDetail

    fun navigationBack() {
        viewModelScope.launch {
            _navigator.emit(NavigationEvent.PopBackStack)
        }
    }
    fun initData(weatherData: MainWeatherData) {
        viewModelScope.launch {
            _weatherData.emit(weatherData)
            _forecastImg.value = weatherData.weather!![0]
            insertUserInfo()
        }
    }

    fun foreCastList() {
        execute {
            when (val result =
                useCase.executeForeCastList(
                    _weatherData.value.cord?.lat!!.toDouble(),
                    _weatherData.value.cord?.lon!!.toDouble(),
                )) {
                is UseCaseResult.Success -> {
                    _forecastDetail.value = result.data
                }
                is UseCaseResult.GenericError -> {
                    _error.emit(result.error.message!!)
                }
                is UseCaseResult.Error -> {
                    val errorMessage = result.exception.message.orEmpty()
                    _error.emit(errorMessage)
                }
            }
        }
    }

    fun insertUserInfo() {
        execute {
            when (val result = databaseUseCase.executeInsertUserInfo(_weatherData.value.weatherSystem!!)) {
                is DatabaseCaseResult.Success -> {
                        Timber.d("success")

                }
                is DatabaseCaseResult.Error->{
                    _error.emit(result.exception.message.toString())
                }
            }
            hideLoading()
        }
    }
}

