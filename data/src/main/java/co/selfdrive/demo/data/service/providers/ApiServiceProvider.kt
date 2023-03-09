package co.selfdrive.demo.data.service.providers

import co.selfdrive.demo.data.service.ApiService
import retrofit2.Retrofit

object ApiServiceProvider {

    fun getApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}
