package co.selfdrive.demo.util.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.media.RingtoneManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import co.selfdrive.demo.R

object NotificationHelper {
    private const val NOTIFICATION_CHANNEL_ID = "channel_high_priority"
    fun showPushNotification(
        context: Context, contentIntent: PendingIntent?,
        notification: PushNotification? = null,temp : String? = ""
    ) {
        val notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(
                NOTIFICATION_CHANNEL_ID, "High priority",
                NotificationManager.IMPORTANCE_HIGH
            )
            notificationManager.createNotificationChannel(notificationChannel)
        }
        val builder = NotificationCompat.Builder(context, NOTIFICATION_CHANNEL_ID)
        builder.setContentTitle("Good Morning")
            .setContentText(temp)
            .setSmallIcon(R.drawable.ic_notification)
            .setColor(ContextCompat.getColor(context, R.color.primary))
            .setPriority(NotificationCompat.PRIORITY_MAX)
            .setAutoCancel(true)
            .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
            .setContentIntent(contentIntent)

        if (notification?.image!!.isNotEmpty()) {
//            val photoBitmap = getBitmapFromUrl(notification.image)
//            builder.setStyle(NotificationCompat.BigPictureStyle().bigPicture(photoBitmap))
        }
        notificationManager.notify(notification.NotificationMessageId!!, builder.build())
    }
}