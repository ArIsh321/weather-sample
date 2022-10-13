package co.weather.coroutine.domain.usecase

import co.weather.coroutine.domain.model.MainWeatherData
import co.weather.coroutine.domain.model.weatherdata.WeatherSystem
import co.weather.coroutine.domain.repository.DatabaseRepository
import javax.inject.Inject

class DatabaseUseCase @Inject constructor(private val repository: DatabaseRepository) {
    suspend fun executeInsertUserInfo(value: WeatherSystem): DatabaseCaseResult<Long> {
        val isSuccessful = repository.insertUserData(value)
       return if(isSuccessful.equals(1)) DatabaseCaseResult.Success(isSuccessful)
       else DatabaseCaseResult.Error(Throwable("Offline Storage Failed"))

    }

}