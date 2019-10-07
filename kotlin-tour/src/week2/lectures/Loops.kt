package lectures

fun main() {
    // same while and do-while as Java
    var c = 10
    while (c > 0) {
        c--
    }
    do {
        c--
    } while (c > 0)


    // for loops
    // iterate over list
    val list = listOf("a", "b", "c")
    for (s in list) {
        print(s)
    }
    println()

    // iterate over contents of a map
    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    for ((key, value) in map) {
        println("$key = $value")
    }

    // iterate over collections with index
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    // iterate over ranges
    // including upper bound
    for (i in 0..9) {
        print(i)
    }
    println()
    // excluding upper bound
    for (i in 0 until 9) {
        print(i)
    }
    println()

    // iterate with a step
    for (i in 9 downTo 0 step 2) {
        print(i)
    }
    println()

    // iterate over a string
    for (ch in "abc") {
        print(ch + 1)
    }
    println()
}