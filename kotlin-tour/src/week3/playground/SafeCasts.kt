package week3.playground

fun main(args: Array<String>) {
    val s = "look, a string!"
    println(s as? Int)    // null
    println(s as Int?)    // exception
}