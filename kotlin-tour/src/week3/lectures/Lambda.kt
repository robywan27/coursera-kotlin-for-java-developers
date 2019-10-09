package week3.lectures

fun testLambda() {
    // lambda syntax: { params -> body }
    {x: Int, y: Int -> x + y}

    val list = listOf(1, 2, 3)
    // full syntax: list.any({i: Int -> i > 0})
    // list.any() {i: Int -> i > 0} -  you can move lambda out of parentheses if it is the last argument
    // list.any {i: Int -> i > 0} - if parentheses have no other argument they can be omitted
    // list.any {i -> i > 0} - the type of the parameter can be omitted if it is clear from the context
    list.any {it > 0} // if there is only one parameter you can use the it argument

    // if there are more than one instruction, you define multi--line lambda
    // the last expression is the result
    list.any {
        println("multi-line lambda")
        it > 0
    }

    val map = mapOf(1 to "1", 2 to "2")
    // destructuring declarations is useful if lambda takes a pair of arguments
    // normal syntax: map.mapValues { entry -> "${entry.key} -> ${entry.value}" }
    map.mapValues { (key, value) -> "$key -> $value" }
    map.mapValues { (_, value) -> "$value" } // you can omit the param if it is not used in the lambda body

}