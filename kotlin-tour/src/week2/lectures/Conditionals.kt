package lectures

import lectures.Color.*
import java.lang.Exception

fun main() {
    // if as an expression
    val a = 4
    val b = 7
    val max = if (a > b) a else b
    // note that no ternary operator is present in Kotlin, because the if is an expression and never a statement
}


// when as a more powerful switch
// no break is needed, only the valid branch will be picked up
fun getDescription(color: Color): String =
    when (color) {
        BLUE -> "blue"
        ORANGE -> "orange"
        RED -> "red"
        else -> "only primary colors!"
    }

// checking if any of multiple values is equalled
fun respondToInput(input: String) =
    when (input) {
        "y", "yes" -> "I'm glad you agree"
        "n", "no" -> "Sorry to hear that"
        else -> "I don't understand you"
    }

// use sets to ignore order of the elements to be equalled
fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, RED) -> INDIGO
        else -> throw Exception("No color")
    }

// class hierarchies: instanceof + sub-type casting all-in-one
fun getSound(): String =
    when (val pet = Pet()) {
        is Cat -> pet.meow()
        is Dog -> pet.bark()
        else -> "zzzz"
    }

// no when argument -> you can put any boolean expression as branch conditional
// note that to creates a pair
fun updateWeather(degrees: Int) {
    val (description, color) = when {
        degrees < 5 -> "cold" to BLUE
        degrees < 23 -> "mild" to ORANGE
        else -> "hot" to RED
    }
}


/*
 Implementation details
 */
enum class Color {
    BLUE, ORANGE, RED, YELLOW, INDIGO, GREEN
}

open class Pet
class Cat : Pet() {
    fun meow() = "meow"
}
class Dog : Pet() {
    fun bark() = "woof"
}