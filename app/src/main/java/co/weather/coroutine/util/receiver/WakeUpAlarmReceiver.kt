package co.weather.coroutine.util.receiver

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.util.*


class WakeUpAlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        if (intent?.action.equals("android.intent.action.BOOT_COMPLETED")) {

            // Quote in Morning
            val calendar: Calendar = Calendar.getInstance()
            calendar.set(Calendar.HOUR_OF_DAY, 6)
            calendar.set(Calendar.MINUTE, 0)
            calendar.set(Calendar.SECOND, 0)
            calendar.set(Calendar.MILLISECOND, 0)
            val cur: Calendar = Calendar.getInstance()
            if (cur.after(calendar)) {
                calendar.add(Calendar.DATE, 1)
            }
            val myIntent = Intent(context, DailyReceiver::class.java)
            val alarmId = 10000
            val pendingIntent = PendingIntent.getBroadcast(
                context, alarmId, myIntent,PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE
            )
            val alarmManager = context?.getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP,
                calendar.timeInMillis,
                AlarmManager.INTERVAL_DAY,
                pendingIntent
            )
        }
    }
}