//Week 1, Day 4,  Exercise 2 and 3

fun main() {
    val txt = "42"
    val num = txt.toInt()
    println("txtValue: $txt \ntxtType: ${txt::class.simpleName}\n")
    println("numValue: $num \nnumType: ${num::class.simpleName}\n")

    //exercise 3
    val float = 2.5
    println("$num + $float = ${num + float}")
}
