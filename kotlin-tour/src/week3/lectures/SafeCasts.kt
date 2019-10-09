package week3.lectures

fun test(any: String?) {
    // is: equivalent to instanceof
    // as (type cast): equivalent to cast to type T
        // if value can't be cast to T an exception is thrown
    if (any is String) {
        // casting is unnecessary because of smart cast
        any.toUpperCase()
        // without smart cast
            // val s = any as String
            // s.toUpperCase()
    }

    // as? (safe cast): returns null if value can't be cast to T
    val s: String? = any as? String
}