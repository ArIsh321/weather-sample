package co.weather.coroutine.data.service

import co.weather.coroutine.data.response.ForeCasteDataResponse
import co.weather.coroutine.data.response.Response
import co.weather.coroutine.data.response.WeatherDataResponse
import co.weather.coroutine.data.response.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService {

    @GET("users")
    suspend fun getResponses(): List<Response>

    @GET("data/2.5/weather")
    suspend fun getLocationWeather(@QueryMap map : Map<String,String>): WeatherDataResponse

    @GET("data/2.5/forecast")
    suspend fun getForecastWeather(@QueryMap map : Map<String,String>): ForeCasteDataResponse

}
