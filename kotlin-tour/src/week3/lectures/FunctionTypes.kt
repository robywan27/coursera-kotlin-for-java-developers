package week3.lectures

// Type of the variable which stores a lambda expression
val sum: (Int, Int) -> Int = { x, y -> x + y }
val isEven: (Int) -> Boolean = { i: Int -> i % 2 == 0 }

val result: Boolean = isEven(42)

// call lambda directly
fun main() {
    // { println("yo") }() - less readable
    run { println("yo") }
}

// Java SAM (single abstract method) interfaces
// postponeComputation is a function which takes as argument a Runnable which defines a SAM interface
fun postponeComputation(delay: Int, computation: Runnable) {}
// you can just pass a lambda as argument to the Runnable
val runnable = Runnable { println(42) }
fun test() {
    postponeComputation(1000, runnable)
}

// difference between
    // () -> Int? - nullable return type
    // (() -> Int)? - nullable whole type
val f1: () -> Int? = { null }
val f2: (() -> Int)? = null

// to call a nullable function type
fun test2() {
    // check if null value + smart cast
    if (f2 != null) {
        f2()
    }
    // de-reference
    f2?.invoke()
}
