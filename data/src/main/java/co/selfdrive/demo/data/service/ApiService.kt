package co.selfdrive.demo.data.service

import co.selfdrive.demo.data.response.ForeCasteDataResponse
import co.selfdrive.demo.data.response.Response
import co.selfdrive.demo.data.response.WeatherDataResponse
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
