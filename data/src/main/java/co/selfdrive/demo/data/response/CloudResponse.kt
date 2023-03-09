package co.selfdrive.demo.data.response

import co.selfdrive.demo.domain.model.weatherdata.Cloud
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
