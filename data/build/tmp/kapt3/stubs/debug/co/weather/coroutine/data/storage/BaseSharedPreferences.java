package co.weather.coroutine.data.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0004J \u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0006\b\u0000\u0010\f\u0018\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0084\b\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0004J#\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u0002H\fH\u0004\u00a2\u0006\u0002\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lco/weather/coroutine/data/storage/BaseSharedPreferences;", "", "()V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "clearAll", "", "get", "T", "key", "", "(Ljava/lang/String;)Ljava/lang/Object;", "remove", "set", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "data_debug"})
public abstract class BaseSharedPreferences {
    protected android.content.SharedPreferences sharedPreferences;
    
    public BaseSharedPreferences() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    protected final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    protected final <T extends java.lang.Object>void set(@org.jetbrains.annotations.NotNull()
    java.lang.String key, T value) {
    }
    
    protected final void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    protected final void clearAll() {
    }
}