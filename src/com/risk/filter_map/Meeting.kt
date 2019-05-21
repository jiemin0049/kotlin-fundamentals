package com.risk.filter_map

class Meeting(id: Int, title: String) {
    val people = listOf(Person("Sam"), Person("Alex"))
}

data class Person(val name: String)