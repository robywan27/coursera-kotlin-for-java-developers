package playground

fun isValidIdentifier(s: String): Boolean {
    fun isLetter(ch: Char) = ch in 'a'..'z' || ch in 'A'..'Z'
    fun isDigit(ch: Char) = ch in '0'..'9'

    if (s.isEmpty()) {
        return false
    }
    if (!isLetter(s[0]) && s[0] != '_') {
        return false
    }
    for (ch in s) {
        if (!isLetter(ch) && !isDigit(ch) && ch != '_') {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}