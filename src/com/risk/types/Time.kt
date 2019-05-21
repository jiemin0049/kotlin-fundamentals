package com.risk.types

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: KevinTime) = setTime(time.hours)
}

interface EndOfTheWorld {
    fun setTime(time: KevinTime) {}
}

class KevinTime {
    val hours: Int = 0
    val minutes: Int = 0
    val secs: Int = 0
}

class YetiTime : Time, EndOfTheWorld {
    override fun setTime(time: KevinTime) {
        super<Time>.setTime(time)
    }

    override fun setTime(hours: Int, mins: Int, secs: Int) {
    }
}