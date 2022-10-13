package co.weather.coroutine.data.response

import co.weather.coroutine.domain.model.weatherdata.Cloud
import com.squareup.moshi.Json

data class CloudResponse(
    @Json(name = "all") val id: Int?
) {
    fun toCloud(): Cloud {
        return Cloud(
            all = this.id
        )
    }
}
