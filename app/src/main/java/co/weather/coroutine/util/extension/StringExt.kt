package co.weather.coroutine.util.extension

import kotlin.math.roundToInt


fun String.isCelcius(): String {
    return "${((this.toInt() - 32) / 1.8).roundToInt()}°C"
}