package lectures

/*
 Top-level functions
 */

// standard way to define a function
/*fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}*/

// convert to expression body and infer return type
// note that type annotation is required for parameters
fun max(a: Int, b: Int) = if (a > b) a else b

// functions without a return value return Unit, which can be omitted
fun displayMax(a: Int, b: Int) {
    println(max(a, b))
}

/*
 Member functions
 */
class A {
    fun member() = 2
}

/*
 Local functions
 */
fun other() {
    fun local() = 3
}