package lectures

fun main() {
    println(listOf('a', 'b', 'c').joinToString(
        separator = "", prefix = "(", postfix = ")"
    ))

    displaySeparator('#', 5)
    // Use default value for size argument
    displaySeparator('#')
    // from second argument you need to pass the name of the argument
    displaySeparator(size = 5)
    displaySeparator()
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}