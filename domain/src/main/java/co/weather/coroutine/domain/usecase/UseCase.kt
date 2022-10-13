package co.weather.coroutine.domain.usecase


import co.weather.coroutine.domain.BuildConfig
import co.weather.coroutine.domain.model.ForeCastList
import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.domain.model.Model
import co.weather.coroutine.domain.repository.Repository
import retrofit2.HttpException
import java.net.ConnectException
import java.net.UnknownHostException
import javax.inject.Inject

const val APP_ID = "3dd269efcc60a545e8b051fa4a35b3d6"
class UseCase @Inject constructor(private val repository: Repository) {

    suspend fun execute(): UseCaseResult<List<Model>> {
        return try {
            val response = repository.getModels()
            UseCaseResult.Success(response)
        } catch (e: IllegalStateException) {
            UseCaseResult.Error(e)
        }
    }

    suspend fun executeWeather(latitude: Double, longitude: Double): UseCaseResult<MainWeatherData> {
        return try {
            val params : MutableMap<String,String> = mutableMapOf()
            params["lat"] = latitude.toString()
            params["lon"] = longitude.toString()
            params["appid"] = APP_ID
            val response = repository.getWeatherByLocation(params)
            UseCaseResult.Success(response)
        }
        catch (e: Exception) {
            when (e) {
                is HttpException -> UseCaseResult.GenericError(e.code(), convertErrorBody(e)!!)
            }
            UseCaseResult.Error(e)
        }
    }

    suspend fun executeCityWeather(cityName : String): UseCaseResult<MainWeatherData> {
        return try {
            val params: MutableMap<String, String> = mutableMapOf()
            params["q"] = cityName
            params["appid"] = APP_ID
            val response = repository.getCityWeather(params)
            UseCaseResult.Success(response)
        } catch (e: Exception) {
            when (e) {
                is HttpException -> UseCaseResult.GenericError(e.code(), convertErrorBody(e)!!)
            }
            UseCaseResult.Error(e)
        }
    }
    suspend fun executeForeCastList(latitude: Double, longitude: Double): UseCaseResult<ForeCastList> {
        return try {
            val params : MutableMap<String,String> = mutableMapOf()
            params["lat"] = latitude.toString()
            params["lon"] = longitude.toString()
            params["appid"] = APP_ID
            val response = repository.getForecastWeather(params)
            UseCaseResult.Success(response)
        } catch (e: Exception) {
            when(e){
                is HttpException -> UseCaseResult.GenericError(e.code(), convertErrorBody(e)!!)
            }
            UseCaseResult.Error(e)
        }
    }

}
