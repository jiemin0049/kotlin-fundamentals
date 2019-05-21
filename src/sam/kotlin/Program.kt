package sam.kotlin

import sam.java.Created
import sam.java.User

fun main(args: Array<String>) {
    var user = User("kevin")

    user.create { println("User $it has been created") }

    val eventListener = Created { println("User $it has been created") }
    user.create(eventListener)
}