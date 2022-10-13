package co.weather.coroutine.data.response;

import java.lang.System;

@androidx.room.Entity(tableName = "weather_data")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u00a7\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u00104\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u00105\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010;\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u0010>\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u00b0\u0001\u0010?\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\fH\u00d6\u0001J\t\u0010E\u001a\u00020\bH\u00d6\u0001J\u0006\u0010F\u001a\u00020GR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b&\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b,\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b-\u0010\u001fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101\u00a8\u0006H"}, d2 = {"Lco/weather/coroutine/data/response/WeatherDataResponse;", "", "cord", "Lco/weather/coroutine/data/response/CordResponse;", "weather", "", "Lco/weather/coroutine/data/response/WeatherResponse;", "base", "", "main", "Lco/weather/coroutine/data/response/MainDataResponse;", "visibility", "", "wind", "Lco/weather/coroutine/data/response/WindResponse;", "cloud", "Lco/weather/coroutine/data/response/CloudResponse;", "dateTime", "", "systemResponse", "Lco/weather/coroutine/data/response/WeatherSystemResponse;", "timezone", "id", "name", "code", "(Lco/weather/coroutine/data/response/CordResponse;Ljava/util/List;Ljava/lang/String;Lco/weather/coroutine/data/response/MainDataResponse;Ljava/lang/Integer;Lco/weather/coroutine/data/response/WindResponse;Lco/weather/coroutine/data/response/CloudResponse;Ljava/lang/Long;Lco/weather/coroutine/data/response/WeatherSystemResponse;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getBase", "()Ljava/lang/String;", "getCloud", "()Lco/weather/coroutine/data/response/CloudResponse;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCord", "()Lco/weather/coroutine/data/response/CordResponse;", "getDateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getMain", "()Lco/weather/coroutine/data/response/MainDataResponse;", "getName", "getSystemResponse", "()Lco/weather/coroutine/data/response/WeatherSystemResponse;", "getTimezone", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lco/weather/coroutine/data/response/WindResponse;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lco/weather/coroutine/data/response/CordResponse;Ljava/util/List;Ljava/lang/String;Lco/weather/coroutine/data/response/MainDataResponse;Ljava/lang/Integer;Lco/weather/coroutine/data/response/WindResponse;Lco/weather/coroutine/data/response/CloudResponse;Ljava/lang/Long;Lco/weather/coroutine/data/response/WeatherSystemResponse;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lco/weather/coroutine/data/response/WeatherDataResponse;", "equals", "", "other", "hashCode", "toString", "toWeatherData", "Lco/weather/coroutine/domain/model/MainWeatherData;", "data_debug"})
public final class WeatherDataResponse {
    @org.jetbrains.annotations.Nullable()
    private final co.weather.coroutine.data.response.CordResponse cord = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<co.weather.coroutine.data.response.WeatherResponse> weather = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String base = null;
    @org.jetbrains.annotations.Nullable()
    private final co.weather.coroutine.data.response.MainDataResponse main = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer visibility = null;
    @org.jetbrains.annotations.Nullable()
    private final co.weather.coroutine.data.response.WindResponse wind = null;
    @org.jetbrains.annotations.Nullable()
    private final co.weather.coroutine.data.response.CloudResponse cloud = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long dateTime = null;
    @org.jetbrains.annotations.Nullable()
    private final co.weather.coroutine.data.response.WeatherSystemResponse systemResponse = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer timezone = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer code = null;
    
    @org.jetbrains.annotations.NotNull()
    public final co.weather.coroutine.data.response.WeatherDataResponse copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "coord")
    co.weather.coroutine.data.response.CordResponse cord, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<co.weather.coroutine.data.response.WeatherResponse> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "base")
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    co.weather.coroutine.data.response.MainDataResponse main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "visibility")
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wind")
    co.weather.coroutine.data.response.WindResponse wind, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cloud")
    co.weather.coroutine.data.response.CloudResponse cloud, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Long dateTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    co.weather.coroutine.data.response.WeatherSystemResponse systemResponse, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "timezone")
    java.lang.Integer timezone, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "id")
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cod")
    java.lang.Integer code) {
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
    
    public WeatherDataResponse(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "coord")
    co.weather.coroutine.data.response.CordResponse cord, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<co.weather.coroutine.data.response.WeatherResponse> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "base")
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    co.weather.coroutine.data.response.MainDataResponse main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "visibility")
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wind")
    co.weather.coroutine.data.response.WindResponse wind, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cloud")
    co.weather.coroutine.data.response.CloudResponse cloud, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Long dateTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    co.weather.coroutine.data.response.WeatherSystemResponse systemResponse, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "timezone")
    java.lang.Integer timezone, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "id")
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cod")
    java.lang.Integer code) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.CordResponse component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.CordResponse getCord() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<co.weather.coroutine.data.response.WeatherResponse> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<co.weather.coroutine.data.response.WeatherResponse> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.MainDataResponse component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.MainDataResponse getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.WindResponse component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.WindResponse getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.CloudResponse component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.CloudResponse getCloud() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.WeatherSystemResponse component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final co.weather.coroutine.data.response.WeatherSystemResponse getSystemResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTimezone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final co.weather.coroutine.domain.model.MainWeatherData toWeatherData() {
        return null;
    }
}