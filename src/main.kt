import com.risk.Person
import java.util.*

fun main(args: Array<String>) {
    val kevin = Person("kevin")

    kevin.name = "Kevin"
    println("name is ${kevin.name}")

    kevin.name = "Steve"
    kevin.display()

    kevin.displayWithLambda(::printName)

    val q = Question()
    q.answer = "42"

    q.display()
    println("The answer to the question ${q.question} is ${q.answer}")

    val message = if (q.answer == q.correctAnswer) {
        "You were correct"
    } else {
        "Try again?"
    }
    println(message)

    val number: Int = try {
        Integer.parseInt(q.answer)
    } catch (e: NumberFormatException) {
        -1
    }
    println(number)

    /*---------------loop ------------------------*/
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in numbers) {
        print("$i ")
    }
    println()
    for ((index, element) in numbers.withIndex()) {
        println("$element at idx $index ")
    }

    val ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 30
    ages["Lili"] = 28
    for ((name, age) in ages) {
        println("$name -> $age")
    }
}

fun printName(name: String) {
    println(name)
}

class Question {
    var answer: String = ""
    val question: String = "What is the answer to life, the universe and everything?"
    val correctAnswer = "42"

    fun display() {
        println("You said $answer")
    }
}