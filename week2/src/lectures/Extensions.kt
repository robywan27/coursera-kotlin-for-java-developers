package lectures

import java.lang.StringBuilder

// extensions allow you to add functions to a class; even though extensions are defined outside the class,
// they can be called as regular members of the class
// The class being extended is called the receiver and it is accessed with this
    // fun String.lastChar() = this.get(this.length - 1)
// this can be omitted
fun String.lastChar() = get(length - 1)

val c: Char = "abc".lastChar()

// extensions must be imported if you want to use them in other Kotlin files

// extensions with arguments
fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}

// you can't call private members of the receiver from extensions, they are regular static functions defined
// in a separate auxiliary file


// extensions and hierarchies
open class Parent
class Child: Parent()
fun Parent.foo() = "parent"
fun Child.foo() = "child"

// in case the name of the extension is the same of the name of a member of the receiver, the extension is shadowed,
// thus the member is called
class B {
    fun foo() = 1
}
fun B.foo() = 2

// overloading is however possible
fun B.foo(i: Int) = i

fun main() {
    val parent: Parent = Child()
    // "parent" is printed because extensions work as Java static functions: the type of the function is defined at
    // compilation time, thus the type Parent of the variable parent
    println(parent.foo())

    println(B().foo()) // 1 is printed

    println(B().foo(2)) // 2 is printed
}
