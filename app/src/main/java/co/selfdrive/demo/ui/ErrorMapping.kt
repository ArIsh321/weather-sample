package co.selfdrive.demo.ui

import android.content.Context
import co.selfdrive.demo.R

fun Throwable.userReadableMessage(context: Context): String {
    return context.getString(R.string.error_generic)
}
