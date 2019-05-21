package com.risk.filter_map

fun main(args: Array<String>) {
    val meetings = listOf<Meeting>(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val people = meetings.map(Meeting::people)
    val people2 = meetings.flatMap(Meeting::people).distinct()

    for (p in people2) println(p.name)
}