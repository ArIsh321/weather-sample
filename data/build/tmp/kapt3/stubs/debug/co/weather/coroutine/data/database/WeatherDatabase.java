package co.weather.coroutine.data.database;

import java.lang.System;

@androidx.room.Database(entities = {co.weather.coroutine.domain.model.weatherdata.WeatherSystem.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lco/weather/coroutine/data/database/WeatherDatabase;", "Landroidx/room/RoomDatabase;", "()V", "weatherDao", "Lco/weather/coroutine/data/database/WeatherDao;", "Companion", "data_debug"})
public abstract class WeatherDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final co.weather.coroutine.data.database.WeatherDatabase.Companion Companion = null;
    private static java.lang.String DB_NAME = "WEATHER-debug";
    @kotlin.jvm.Volatile()
    private static volatile co.weather.coroutine.data.database.WeatherDatabase INSTANCE;
    private static final java.lang.Object LOCK = null;
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    
    public WeatherDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract co.weather.coroutine.data.database.WeatherDao weatherDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lco/weather/coroutine/data/database/WeatherDatabase$Companion;", "", "()V", "DB_NAME", "", "INSTANCE", "Lco/weather/coroutine/data/database/WeatherDatabase;", "LOCK", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "MIGRATION_2_3", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final co.weather.coroutine.data.database.WeatherDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final co.weather.coroutine.data.database.WeatherDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}