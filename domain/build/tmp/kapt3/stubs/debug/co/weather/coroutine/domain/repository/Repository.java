package co.weather.coroutine.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lco/weather/coroutine/domain/repository/Repository;", "", "getCityWeather", "Lco/weather/coroutine/domain/model/MainWeatherData;", "params", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForecastWeather", "Lco/weather/coroutine/domain/model/ForeCastList;", "getModels", "", "Lco/weather/coroutine/domain/model/Model;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherByLocation", "domain_debug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getModels(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<co.weather.coroutine.domain.model.Model>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWeatherByLocation(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super co.weather.coroutine.domain.model.MainWeatherData> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCityWeather(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super co.weather.coroutine.domain.model.MainWeatherData> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getForecastWeather(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super co.weather.coroutine.domain.model.ForeCastList> continuation);
}