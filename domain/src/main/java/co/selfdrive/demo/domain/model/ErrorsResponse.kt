package co.selfdrive.demo.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ErrorsResponse(
    @Json(name = "cod") val status: String = "",
    @Json(name = "message") val message: String? = "",
)