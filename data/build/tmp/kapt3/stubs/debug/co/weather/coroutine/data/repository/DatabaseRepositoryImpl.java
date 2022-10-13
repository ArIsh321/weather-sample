package co.weather.coroutine.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lco/weather/coroutine/data/repository/DatabaseRepositoryImpl;", "Lco/weather/coroutine/domain/repository/DatabaseRepository;", "context", "Landroid/content/Context;", "database", "Lco/weather/coroutine/data/database/WeatherDatabase;", "(Landroid/content/Context;Lco/weather/coroutine/data/database/WeatherDatabase;)V", "insertUserData", "", "data", "Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;", "(Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class DatabaseRepositoryImpl implements co.weather.coroutine.domain.repository.DatabaseRepository {
    private final android.content.Context context = null;
    private final co.weather.coroutine.data.database.WeatherDatabase database = null;
    
    public DatabaseRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    co.weather.coroutine.data.database.WeatherDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertUserData(@org.jetbrains.annotations.NotNull()
    co.weather.coroutine.domain.model.weatherdata.WeatherSystem data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
}