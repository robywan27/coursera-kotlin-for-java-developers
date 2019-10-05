package lectures

import java.io.IOException
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

// there is no difference between checked and unchecked exceptions

// throw is an expression
fun getPercentage(number: Int) {
    val percentage =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException("A percentage value must be between 0 and 100, $number given")
}

// try catch is also an expression
fun getNumber(string: String) =
    try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        null
    }

// If you call a function throwing an exception from Java you need to add an annotation or it won't compile
@Throws(IOException::class)
fun foo() { throw IOException() }
