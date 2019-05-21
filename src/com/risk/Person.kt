package com.risk

class Person(var name: String) {
    fun display() {
        println("Display name: $name")
    }

    fun displayWithLambda(func: (s: String) -> Unit) {
        func(name)
    }
}