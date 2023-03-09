package co.selfdrive.demo.domain.usecase

import co.selfdrive.demo.domain.model.weatherdata.WeatherSystem
import co.selfdrive.demo.domain.repository.DatabaseRepository
import javax.inject.Inject

class DatabaseUseCase @Inject constructor(private val repository: DatabaseRepository) {
    suspend fun executeInsertUserInfo(value: WeatherSystem): DatabaseCaseResult<Long> {
        val isSuccessful = repository.insertUserData(value)
       return if(isSuccessful.equals(1)) DatabaseCaseResult.Success(isSuccessful)
       else DatabaseCaseResult.Error(Throwable("Offline Storage Failed"))

    }

}