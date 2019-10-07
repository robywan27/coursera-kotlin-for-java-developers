package lectures

/***
    IMPORTANT: Kotlin standard library = Java standard library + extensions
 */


fun main() {
    val set = hashSetOf(1, 3, 5)
    val list = arrayListOf(1, 3, 5)
    val map = hashMapOf(1 to "one", 3 to "three", 5 to "five")
    // under the hood these classes are from the std Java library
    println(set.javaClass)      // class java.util.HashSet
    println(list.javaClass)     // class java.util.ArrayList
    println(map.javaClass)      // class java.util.HashMap
    // Kotlin however adds some extensions to these classes, like for example
    list.max()

    // other examples
    // fun <T> Iterable<T>.joinToString(separator, prefix, postfix)
    // fun <T> List<T>.getOrNull(index: Int)
    // fun <T> Iterable<T>.withIndex()
    // infix fun Int.until(to: Int)
        // infix lets you write a function in infix form
        1 until 10
        // instead of
        1.until(10)
    // infix fun <A, B> A.to(that: B) = Pair(this, that)
    // infix fun <T> T.eq(other: T)

    // on chars: isLetter, isLetterOrDigit
    // on strings: trimMargin, trimIndent, toRegex, toInt, toDouble
}
