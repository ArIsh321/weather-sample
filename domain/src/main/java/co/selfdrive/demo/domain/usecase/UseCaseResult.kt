package co.selfdrive.demo.domain.usecase

import co.selfdrive.demo.domain.model.ErrorsResponse

sealed class UseCaseResult<out T : Any?> {
    class Success<out T : Any>(val data: T) : UseCaseResult<T>()
    data class GenericError(val code: Int? = null, val error: ErrorsResponse): UseCaseResult<Nothing>()
    class Error(val exception: Throwable) : UseCaseResult<Nothing>()
}
