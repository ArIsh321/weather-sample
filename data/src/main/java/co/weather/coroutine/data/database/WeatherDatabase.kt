package co.weather.coroutine.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import co.weather.coroutine.data.BuildConfig
import co.weather.coroutine.domain.model.weatherdata.WeatherSystem
import co.weather.coroutine.domain.model.weatherdata.WeatherSystem.Companion.CITY_WEATHER


@Database(
    entities = [WeatherSystem::class], version = 1,exportSchema = false
)

abstract class WeatherDatabase : RoomDatabase() {

    abstract fun weatherDao(): WeatherDao

    companion object {
        private var DB_NAME = "WEATHER-" + BuildConfig.BUILD_TYPE

        @Volatile
        private var INSTANCE: WeatherDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = INSTANCE ?: synchronized(LOCK) {
            buildDatabase(context).also {
                INSTANCE = it
            }
        }

        private fun buildDatabase(context: Context): WeatherDatabase =
            Room.databaseBuilder(context, WeatherDatabase::class.java, DB_NAME)
                .fallbackToDestructiveMigration()
                .addMigrations(MIGRATION_1_2)
                .addMigrations(MIGRATION_2_3)
                .build()


        private val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE $CITY_WEATHER ADD COLUMN INTEGER ")
            }
        }

        private val MIGRATION_2_3 = object : Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE $CITY_WEATHER ADD COLUMN TEXT ")
            }
        }
    }
}