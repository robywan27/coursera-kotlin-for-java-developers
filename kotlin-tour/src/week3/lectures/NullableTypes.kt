package week3.lectures

fun main() {
    // nullable types: variable can either have type T value or null
    var nullableStr: String? = "a string"
    nullableStr = null

    // de-referencing nullable types with ?. allows you to de-reference the value safely
    // if you try to access the value normally you would get a compiler error
    val nullableLen: Int? = nullableStr?.length

    // Elvis operator ?: if you want to make a nullable type non-nullable
    // if the value is not null, the left-hand side expression of ?: is executed, otherwise the right one
    var len: Int = nullableStr?.length ?: 0

    // if a nullable value is known to be non-null, the compiler does a smart cast and you do not need to de-reference
    nullableStr = "back to string"
    len = nullableStr.length

    // Make null-pointer exception explicit with !! operator.
    // Remember to use this with moderation only if necessary, otherwise use previous strategies
    nullableStr!!.length


    // nullable types under the hood:
        // @Nullable annotation is added at compile time
        // @NotNull annotation is added for non-nullable types
    // This results in no performance overhead!

    // Optionals: library classes which store a value or absence of value.
    // However it increases the performance because it is a wrapper which stores the reference to the initial object.
    // For each optional value an extra object is created


    // Difference between:
        // list of nullable elements: List<Int?>
        // nullable list: List<Int>?
    fun foo(list1: List<Int?>, list2: List<Int>?) {
        list1.size
        list2?.size

        val i: Int? = list1.get(0)
        val j: Int? = list2?.get(0)
    }
}

