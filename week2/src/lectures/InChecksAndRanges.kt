package lectures

fun main() {
    // in is used as
    // 1. iteration
    for (i in 'a'..'z') {}
    // 2. check belonging
    'c' in 'a'..'z'


    // check belonging in a collection
    val element = 2
    val list = listOf(1, 2, 3, 4)
    if (element in list) {
        println("In the list")
    }

    // check belonging in a range
    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    // syntactic sugar for: 'a' <= c && c <= 'z'
    isLetter('q')
    isLetter('*')

    // not in a range
    fun isNotDigit(c: Char) = c !in '0'..'9'
    isNotDigit('x')

    // in when condition
    fun recognize(c: Char) = when (c) {
        in '0'..'9' -> "It's a digit"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter"
        else -> "I don't know"
    }
    recognize('$')

    // ranges of different types
    val intRange: IntRange = 1..9
    val charRange: CharRange = 'a'..'z'
    val stringRange: ClosedRange<String> = "ab".."az"
    // val dateRange: ClosedRange<MyDate> = startDate..endDate

    // strings are compared lexicographically
    "Kotlin" in "Java".."Scala"

    // class MyDate : Comparable<MyDate>
    // if (myDate >= startDate && myDate <= endDate) {...}
    // if (myDate in startDate..endDate)
}

