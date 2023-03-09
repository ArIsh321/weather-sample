package co.selfdrive.demo.data.database;

import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import co.selfdrive.demo.domain.model.weatherdata.WeatherSystem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDao_Impl implements WeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherSystem> __insertionAdapterOfWeatherSystem;

  public WeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherSystem = new EntityInsertionAdapter<WeatherSystem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `city_weather` (`id`,`type`,`country`,`sunrise`,`sunset`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherSystem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getType());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCountry());
        }
        if (value.getSunrise() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getSunrise());
        }
        if (value.getSunset() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getSunset());
        }
      }
    };
  }

  @Override
  public Object insertToRoomDatabase(final WeatherSystem user,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfWeatherSystem.insertAndReturnId(user);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
