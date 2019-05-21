package com.risk.filter_map

fun main(args: Array<String>) {
    var ints = listOf(1, 2, 3, 4, 5)

    val smallInts = ints.filter { it < 4 }

    //for (i: Int in smallInts) println(i)


    //------------------predicates---------------------
    var largeInts = ints.all { it > 6 }
    println(largeInts)

    largeInts = ints.any { it > 3 }
    println(largeInts)

    var numberOfLargeInts = ints.count { it >3 }
    println(numberOfLargeInts)

    val greaterThanTow = {v:Int -> v > 2}
    largeInts = ints.all(greaterThanTow)
    println(largeInts)

    var found = ints.find(greaterThanTow)
    println(found)

}