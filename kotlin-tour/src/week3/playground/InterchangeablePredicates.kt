package week3.playground

fun List<Int>.allNonZero() =  all { it != 0 }
fun List<Int>.allNonZero1() =  none { it == 0 }
fun List<Int>.allNonZero2() =  !any { it == 0 }

fun List<Int>.containsZero() =  any { it == 0 }
fun List<Int>.containsZero1() =  !all { it != 0 }
fun List<Int>.containsZero2() =  !none { it == 0 }

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3)
    list1.allNonZero()
    list1.allNonZero1()
    list1.allNonZero2()

    list1.containsZero()
    list1.containsZero1()
    list1.containsZero2()

    val list2 = listOf(0, 1, 2)
    list2.allNonZero()
    list2.allNonZero1()
    list2.allNonZero2()

    list2.containsZero()
    list2.containsZero1()
    list2.containsZero2()
}
