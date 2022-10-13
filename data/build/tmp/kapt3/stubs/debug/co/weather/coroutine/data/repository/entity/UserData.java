package co.weather.coroutine.data.repository.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010,\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016Jt\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u00020\u0003H\u00d6\u0001J\t\u00105\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u00066"}, d2 = {"Lco/weather/coroutine/data/repository/entity/UserData;", "Ljava/io/Serializable;", "id", "", "cloud", "Lco/weather/coroutine/domain/model/weatherdata/Cloud;", "weather", "", "Lco/weather/coroutine/domain/model/weatherdata/Weather;", "weatherSystem", "Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;", "wind", "Lco/weather/coroutine/domain/model/weatherdata/Wind;", "dateTime", "", "name", "", "cod", "(Ljava/lang/Integer;Lco/weather/coroutine/domain/model/weatherdata/Cloud;Ljava/util/List;Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;Lco/weather/coroutine/domain/model/weatherdata/Wind;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getCloud", "()Lco/weather/coroutine/domain/model/weatherdata/Cloud;", "getCod", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getName", "()Ljava/lang/String;", "getWeather", "()Ljava/util/List;", "setWeather", "(Ljava/util/List;)V", "getWeatherSystem", "()Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;", "getWind", "()Lco/weather/coroutine/domain/model/weatherdata/Wind;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Lco/weather/coroutine/domain/model/weatherdata/Cloud;Ljava/util/List;Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;Lco/weather/coroutine/domain/model/weatherdata/Wind;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lco/weather/coroutine/data/repository/entity/UserData;", "equals", "", "other", "", "hashCode", "toString", "data_debug"})
public final class UserData implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final co.weather.coroutine.domain.model.weatherdata.Cloud cloud = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<co.weather.coroutine.domain.model.weatherdata.Weather> weather;
    @org.jetbrains.annotations.Nullable()
    private final co.weather.coroutine.domain.model.weatherdata.WeatherSystem weatherSystem = null;
    @org.jetbrains.annotations.Nullable()
    private final co.weather.coroutine.domain.model.weatherdata.Wind wind = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long dateTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer cod = null;
    
    @org.jetbrains.annotations.NotNull()
    public final co.weather.coroutine.data.repository.entity.UserData copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Cloud cloud, @org.jetbrains.annotations.Nullable()
    java.util.List<co.weather.coroutine.domain.model.weatherdata.Weather> weather, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.WeatherSystem weatherSystem, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Wind wind, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateTime, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cod) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UserData() {
        super();
    }
    
    public UserData(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Cloud cloud, @org.jetbrains.annotations.Nullable()
    java.util.List<co.weather.coroutine.domain.model.weatherdata.Weather> weather, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.WeatherSystem weatherSystem, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Wind wind, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateTime, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cod) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Cloud component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Cloud getCloud() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<co.weather.coroutine.domain.model.weatherdata.Weather> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<co.weather.coroutine.domain.model.weatherdata.Weather> getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.Nullable()
    java.util.List<co.weather.coroutine.domain.model.weatherdata.Weather> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.WeatherSystem component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.WeatherSystem getWeatherSystem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Wind component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCod() {
        return null;
    }
}