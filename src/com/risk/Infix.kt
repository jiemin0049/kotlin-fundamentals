package com.risk

fun main(args: Array<String>) {
    val h1 = Header("h1")
    val h2 = Header("h2")

    val h3 = h1 plus h2
    println(h3.name)

    println((h1 minus h2).name)
    println((h1 - h2).name)
}

class Header(val name: String)

infix fun Header.plus(other: Header): Header {
    return Header(this.name + " + " + other.name)
}

operator infix fun Header.minus(other: Header): Header {
    return Header(this.name + " - " + other.name)
}