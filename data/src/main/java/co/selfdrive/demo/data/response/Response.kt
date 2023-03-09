package co.selfdrive.demo.data.response

import co.selfdrive.demo.domain.model.Model
import com.squareup.moshi.Json

data class Response(
    @Json(name = "id") val id: Int?
)

private fun Response.toModel() = Model(id = this.id)

fun List<Response>.toModels() = this.map { it.toModel() }
