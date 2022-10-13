package co.weather.coroutine.ui

import android.content.Context
import co.weather.coroutine.R

fun Throwable.userReadableMessage(context: Context): String {
    return context.getString(R.string.error_generic)
}
