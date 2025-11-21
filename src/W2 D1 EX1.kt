//Week 4, Day 1,  Exercise 1 and 3
fun main() {
    print("Type first number: ")
    val num1: Int = readln().toInt()
    print("Type second number: ")
    val num2: Int = readln().toInt()
    println(
        "$num1 + $num2 = ${num1 + num2} \n" +
        "$num1 - $num2 = ${num1 - num2} \n" +
        "$num1 X $num2 = ${num1 * num2} \n" +
        "$num1 / $num2 = ${num1.toDouble() / num2} \n"
    )

    // exercise 3
    println(
        "$num1 = $num2: ${num1 == num2} \n" +
        "$num1 > $num2: ${num1 > num2} \n" +
        "$num1 < $num2: ${num1 < num2}"
    )
}