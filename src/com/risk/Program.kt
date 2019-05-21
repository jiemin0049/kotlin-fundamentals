@file: JvmName("DisplayLog")
package com.risk

fun main(args: Array<String>) {
    // named parameters
    log(logLevel = 4, message = "named parameters")
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)
}