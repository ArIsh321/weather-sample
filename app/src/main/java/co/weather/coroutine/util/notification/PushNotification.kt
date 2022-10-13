package co.weather.coroutine.util.notification

import com.google.firebase.messaging.RemoteMessage
import java.io.Serializable

class PushNotification(
    var body: String? = null,
    var title: String? = null,
    var image: String? = "",
    var Type: Int? = 0,
    var NotificationMessageId: Int? = 0,
    var ObjectId: Int? = 0): Serializable {
    constructor() : this(body = "")
    constructor(remoteMessage: RemoteMessage) : this() {
        val params = remoteMessage.data
        for (key in params.keys) {
            when (key) {
                "ObjectId"-> ObjectId = params.getValue("ObjectId").toInt()
                "Type"-> Type = params.getValue("Type").toInt()
                "NotificationMessageId"-> NotificationMessageId = params.getValue("NotificationMessageId").toInt()
                "image"-> image = params.getValue("image")
            }
        }
        remoteMessage.notification?.let { notification->
            body = notification.body
            title= notification.title
        }
        remoteMessage.notification?.imageUrl?.let {
        }
    }
}
