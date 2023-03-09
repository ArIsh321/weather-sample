package co.selfdrive.demo.domain.model.weatherdata

data class MainTemp(
    val temp: Float? = 0f,
    val feelsLike: Float? =0f,
    val tempMin: Float? = 0f,
    val tempMax: Float? = 0f,
    val pressure: Int? = 1,
    val humidity: Int? = 1,
)
