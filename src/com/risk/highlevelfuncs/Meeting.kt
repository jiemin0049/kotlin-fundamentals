package com.risk.highlevelfuncs

import java.util.*

class Meeting {
    var title: String = ""
    var When: Date = Date()
    var who = mutableListOf<String>()

    fun create() {}
}

fun main(args: Array<String>) {
    var m = Meeting()
    m.title = "plan"
    m.When = Date(2017, 1, 1)
    m.who.add("Kevin")

    with(m) {
        title = "with meeting"
        When = Date(2017, 1, 1)
        who.add("Kevin")
    }

    m.apply {
        title = "with meeting"
        When = Date(2017, 1, 1)
        who.add("Kevin")
    }.create()
}