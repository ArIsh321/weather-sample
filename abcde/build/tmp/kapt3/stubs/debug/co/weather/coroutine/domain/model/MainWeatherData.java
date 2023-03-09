package co.weather.coroutine.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u000b\u0010H\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u008c\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u00d6\u0003J\t\u0010O\u001a\u00020\u0003H\u00d6\u0001J\t\u0010P\u001a\u00020\u0014H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\u00a8\u0006Q"}, d2 = {"Lco/weather/coroutine/domain/model/MainWeatherData;", "Ljava/io/Serializable;", "id", "", "cloud", "Lco/weather/coroutine/domain/model/weatherdata/Cloud;", "cord", "Lco/weather/coroutine/domain/model/weatherdata/Cord;", "mainTemp", "Lco/weather/coroutine/domain/model/weatherdata/MainTemp;", "weather", "", "Lco/weather/coroutine/domain/model/weatherdata/Weather;", "weatherSystem", "Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;", "wind", "Lco/weather/coroutine/domain/model/weatherdata/Wind;", "dateTime", "", "name", "", "cod", "(Ljava/lang/Integer;Lco/weather/coroutine/domain/model/weatherdata/Cloud;Lco/weather/coroutine/domain/model/weatherdata/Cord;Lco/weather/coroutine/domain/model/weatherdata/MainTemp;Ljava/util/List;Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;Lco/weather/coroutine/domain/model/weatherdata/Wind;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getCloud", "()Lco/weather/coroutine/domain/model/weatherdata/Cloud;", "setCloud", "(Lco/weather/coroutine/domain/model/weatherdata/Cloud;)V", "getCod", "()Ljava/lang/Integer;", "setCod", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCord", "()Lco/weather/coroutine/domain/model/weatherdata/Cord;", "setCord", "(Lco/weather/coroutine/domain/model/weatherdata/Cord;)V", "getDateTime", "()Ljava/lang/Long;", "setDateTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "setId", "getMainTemp", "()Lco/weather/coroutine/domain/model/weatherdata/MainTemp;", "setMainTemp", "(Lco/weather/coroutine/domain/model/weatherdata/MainTemp;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getWeather", "()Ljava/util/List;", "setWeather", "(Ljava/util/List;)V", "getWeatherSystem", "()Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;", "setWeatherSystem", "(Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;)V", "getWind", "()Lco/weather/coroutine/domain/model/weatherdata/Wind;", "setWind", "(Lco/weather/coroutine/domain/model/weatherdata/Wind;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Lco/weather/coroutine/domain/model/weatherdata/Cloud;Lco/weather/coroutine/domain/model/weatherdata/Cord;Lco/weather/coroutine/domain/model/weatherdata/MainTemp;Ljava/util/List;Lco/weather/coroutine/domain/model/weatherdata/WeatherSystem;Lco/weather/coroutine/domain/model/weatherdata/Wind;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lco/weather/coroutine/domain/model/MainWeatherData;", "equals", "", "other", "", "hashCode", "toString", "domain_debug"})
public final class MainWeatherData implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    private co.weather.coroutine.domain.model.weatherdata.Cloud cloud;
    @org.jetbrains.annotations.Nullable()
    private co.weather.coroutine.domain.model.weatherdata.Cord cord;
    @org.jetbrains.annotations.Nullable()
    private co.weather.coroutine.domain.model.weatherdata.MainTemp mainTemp;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<co.weather.coroutine.domain.model.weatherdata.Weather> weather;
    @org.jetbrains.annotations.Nullable()
    private co.weather.coroutine.domain.model.weatherdata.WeatherSystem weatherSystem;
    @org.jetbrains.annotations.Nullable()
    private co.weather.coroutine.domain.model.weatherdata.Wind wind;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long dateTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer cod;
    
    @org.jetbrains.annotations.NotNull()
    public final co.weather.coroutine.domain.model.MainWeatherData copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Cloud cloud, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Cord cord, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.MainTemp mainTemp, @org.jetbrains.annotations.Nullable()
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
    
    public MainWeatherData() {
        super();
    }
    
    public MainWeatherData(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Cloud cloud, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Cord cord, @org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.MainTemp mainTemp, @org.jetbrains.annotations.Nullable()
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
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Cloud component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Cloud getCloud() {
        return null;
    }
    
    public final void setCloud(@org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Cloud p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Cord component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Cord getCord() {
        return null;
    }
    
    public final void setCord(@org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Cord p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.MainTemp component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.MainTemp getMainTemp() {
        return null;
    }
    
    public final void setMainTemp(@org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.MainTemp p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<co.weather.coroutine.domain.model.weatherdata.Weather> component5() {
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
    public final co.weather.coroutine.domain.model.weatherdata.WeatherSystem component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.WeatherSystem getWeatherSystem() {
        return null;
    }
    
    public final void setWeatherSystem(@org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.WeatherSystem p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Wind component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.domain.model.weatherdata.Wind getWind() {
        return null;
    }
    
    public final void setWind(@org.jetbrains.annotations.Nullable()
    co.weather.coroutine.domain.model.weatherdata.Wind p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDateTime() {
        return null;
    }
    
    public final void setDateTime(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCod() {
        return null;
    }
    
    public final void setCod(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}