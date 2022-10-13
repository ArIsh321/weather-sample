package co.weather.coroutine.domain.usecase

import co.weather.coroutine.domain.model.ErrorsResponse

sealed class DatabaseCaseResult<out T : Any?> {
    class Success<out T : Any>(val data: T) : DatabaseCaseResult<T>()
    data class GenericError(val code: Int? = null, val error: ErrorsResponse): DatabaseCaseResult<Nothing>()
    class Error(val exception: Throwable) : DatabaseCaseResult<Nothing>()
}