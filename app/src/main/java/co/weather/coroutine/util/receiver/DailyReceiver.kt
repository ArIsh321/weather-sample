package co.weather.coroutine.util.receiver

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import co.weather.coroutine.ui.screens.MainActivity
import co.weather.coroutine.util.notification.NotificationHelper


class DailyReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val temp :String = ""

        var notifyIntent = Intent()
                notifyIntent = Intent(context, MainActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        val notifyPendingIntent = PendingIntent.getActivity(
            context, 0, notifyIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE
        )
        if(intent?.data!=null){
            NotificationHelper.showPushNotification(context!!, notifyPendingIntent,temp = intent.getStringExtra("todayTemp"))
        }
        NotificationHelper.showPushNotification(context!!, notifyPendingIntent)

    }
}