package com.risk.types

data class Meeting(val name: String, val location: String)

fun main(args: Array<String>) {
    val londonMeeting = Meeting("A Meeting", "London")
    val nyMeeting = londonMeeting.copy(location = "New York")

    println(londonMeeting)
    println(nyMeeting)
}