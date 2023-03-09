package co.weather.coroutine.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lco/weather/coroutine/domain/repository/DatabaseRepository;", "", "insertUserData", "", "value", "Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;", "(Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface DatabaseRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertUserData(@org.jetbrains.annotations.NotNull()
    co.weather.coroutine.domain.model.weatherdata.WeatherSystem value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
}