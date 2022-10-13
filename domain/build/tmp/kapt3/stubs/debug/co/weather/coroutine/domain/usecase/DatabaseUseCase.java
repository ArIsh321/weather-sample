package co.weather.coroutine.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lco/weather/coroutine/domain/usecase/DatabaseUseCase;", "", "repository", "Lco/weather/coroutine/domain/repository/DatabaseRepository;", "(Lco/weather/coroutine/domain/repository/DatabaseRepository;)V", "executeInsertUserInfo", "Lco/weather/coroutine/domain/usecase/DatabaseCaseResult;", "", "value", "Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;", "(Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class DatabaseUseCase {
    private final co.weather.coroutine.domain.repository.DatabaseRepository repository = null;
    
    @javax.inject.Inject()
    public DatabaseUseCase(@org.jetbrains.annotations.NotNull()
    co.weather.coroutine.domain.repository.DatabaseRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object executeInsertUserInfo(@org.jetbrains.annotations.NotNull()
    co.weather.coroutine.domain.model.weatherdata.WeatherSystem value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super co.weather.coroutine.domain.usecase.DatabaseCaseResult<java.lang.Long>> continuation) {
        return null;
    }
}