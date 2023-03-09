package co.selfdrive.demo.util.notification

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.content.Intent
import co.selfdrive.demo.ui.screens.MainActivity
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import co.selfdrive.demo.util.notification.NotificationHelper.showPushNotification
import timber.log.Timber

class MyFirebaseMessagingService: FirebaseMessagingService() {

    @SuppressLint("TimberArgCount")
    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        if (message.data.isEmpty()) return
        Timber.e("xxxx ", "sss $message.data")
        val pushNotification = PushNotification(message)
        sendNotification(pushNotification)
    }

    private fun sendNotification(notification: PushNotification) {
        var notifyIntent = Intent()
        when(notification.Type){
            1->{
                notifyIntent = Intent(this, MainActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                }
            }
        }

        val notifyPendingIntent = PendingIntent.getActivity(
            this, 0, notifyIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE
        )
        showPushNotification(this, notifyPendingIntent, notification)
    }
}