package lectures

fun main() {
    // read-only (immutable) variables + type inference
    val greetings = "hello"

    // mutable variables + type inference
    var color = "red"
    color = "green"
    // this is not possible: color = 1
    // because color has inferred type String

    // lists
    val mutableList = mutableListOf("java")
    mutableList.add("kotlin")
    val readOnlyList = listOf("kotlin")
    // cannot add elements to readOnlyList
}
