package com.risk.types

class Course(val id: Int, val title: String) {

}

object Courses {
    val allCourses = arrayListOf<Course>()

    fun init() {
        allCourses.add(Course(1, "Kotlin Fundamentals"))
    }
}