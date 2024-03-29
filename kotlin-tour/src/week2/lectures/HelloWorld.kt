package lectures

fun main(args: Array<String>) {
    // note that if is an expression instead of a statement <- FP influence
    val name = if (args.size > 0) args[0] else "Kotlin"
    // string template: "...$variable..."
    println("Hello, $name")
    // "...${functionCall(...)}..."
    println("Hello ${args.getOrNull(0)}")
}