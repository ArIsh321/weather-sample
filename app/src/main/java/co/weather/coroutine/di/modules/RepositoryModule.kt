package co.weather.coroutine.di.modules


import android.content.Context
import co.weather.coroutine.data.database.WeatherDatabase
import co.weather.coroutine.data.repository.DatabaseRepositoryImpl
import co.weather.coroutine.data.repository.RepositoryImpl
import co.weather.coroutine.data.service.ApiService
import co.weather.coroutine.domain.repository.DatabaseRepository
import co.weather.coroutine.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {

    @Provides
    fun provideRepository(apiService: ApiService): Repository = RepositoryImpl(apiService)

    @Provides
    fun provideMediaRepository(@ApplicationContext context: Context, database: WeatherDatabase): DatabaseRepository =
        DatabaseRepositoryImpl(context = context, database = database)
}
