package co.selfdrive.demo.domain.usecase

import co.selfdrive.demo.domain.model.ErrorsResponse

sealed class DatabaseCaseResult<out T : Any?> {
    class Success<out T : Any>(val data: T) : DatabaseCaseResult<T>()
    data class GenericError(val code: Int? = null, val error: ErrorsResponse): DatabaseCaseResult<Nothing>()
    class Error(val exception: Throwable) : DatabaseCaseResult<Nothing>()
}