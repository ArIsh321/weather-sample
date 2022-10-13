package co.weather.coroutine.data.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lco/weather/coroutine/data/storage/NormalSharedPreferences;", "Lco/weather/coroutine/data/storage/BaseSharedPreferences;", "applicationContext", "Landroid/content/Context;", "defaultSharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/Context;Landroid/content/SharedPreferences;)V", "useCustomSharedPreferences", "", "name", "", "useDefaultSharedPreferences", "data_debug"})
public final class NormalSharedPreferences extends co.weather.coroutine.data.storage.BaseSharedPreferences {
    private final android.content.Context applicationContext = null;
    private final android.content.SharedPreferences defaultSharedPreferences = null;
    
    @javax.inject.Inject()
    public NormalSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences defaultSharedPreferences) {
        super();
    }
    
    public final void useDefaultSharedPreferences() {
    }
    
    public final void useCustomSharedPreferences(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}