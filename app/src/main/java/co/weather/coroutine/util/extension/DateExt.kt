package co.weather.coroutine.util.extension

import java.text.SimpleDateFormat
import java.util.*


fun String.isDate(): String {
    val unixSeconds: Long = this.toLong()
    val date = Date(unixSeconds * 1000L)
    val sdf: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    return sdf.format(date)
}

fun String.isTime(): String {
    val unixSeconds: Long = this.toLong()
    val date = Date(unixSeconds * 1000L)
    val sdf: SimpleDateFormat = SimpleDateFormat("HH:mm")
    return sdf.format(date)
}

