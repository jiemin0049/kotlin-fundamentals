package com.risk.types

// 'open' class to be extended and override
open class Person {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
}

class Student : Person() {
    override fun getName(): String = ""
}


//---------------------------------------------------------------------

// abstract class
abstract class Human {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Teacher : Human() {
    override fun getAddress(): String {
        return "Address"
    }

    override fun getName(): String = ""
}

fun main(args: Array<String>) {
    val kevin = Worker(1)
    println(kevin.id)

    val tom = Worker2(2)
    println(tom.id)

    Cat.createPostgrad("cat1")
}

class Worker(val id: Int) : Human() {
    override fun getAddress(): String {
        return "Address"
    }

    override fun getName(): String = ""
}

//or
class Worker2(_id: Int) : Human() {
    val id: Int

    init {
        id = _id
    }

    override fun getAddress(): String {
        return "Address"
    }

    override fun getName(): String = ""
}

/////////////////////////////////////////////////////////

abstract class Animal(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Dog(id: Int, firstName: String, lastName: String) : Animal(firstName, lastName) {
    override fun getName(): String = ""
    override fun getAddress(): String = ""
}

// use object keyword (Courses) as singlton
class Cat(firstName: String, lastName: String, id: Int) : Animal(firstName, lastName) {
    val id: Int = id
    override fun getAddress(): String = ""

    fun enrole(courseName: String) {
        val course = Courses.allCourses
            .filter { it.title == courseName }
            .firstOrNull()
    }

    // used for static method. companion object also can extend interface
    companion object : XlmSerializer<Animal> {
        fun createUndergrad(name: String): Undergraduate {
            return Undergraduate(name)
        }

        fun createPostgrad(name: String): Postgraduate {
            return Postgraduate(name)
        }

        override fun toXml(item: Animal) {
        }
    }
}

class Undergraduate(firstName: String)
class Postgraduate(firstName: String)

interface XlmSerializer<T> {
    fun toXml(item: T)
}