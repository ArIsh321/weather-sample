package co.weather.coroutine.domain.model

data class ForeCastList (
    var weatherDataList: List<MainWeatherData>? = arrayListOf(),
    )