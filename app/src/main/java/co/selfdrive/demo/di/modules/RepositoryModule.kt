package co.selfdrive.demo.di.modules


import android.content.Context
import co.selfdrive.demo.data.database.WeatherDatabase
import co.selfdrive.demo.data.repository.DatabaseRepositoryImpl
import co.selfdrive.demo.data.repository.RepositoryImpl
import co.selfdrive.demo.data.service.ApiService
import co.selfdrive.demo.domain.repository.DatabaseRepository
import co.selfdrive.demo.domain.repository.Repository
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
