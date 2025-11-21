//Week 4, Day 1, Exercise 1 to 3

fun studying() {
    println("Studying Kotlin!")
}

fun add(num1 : Int, num2 : Int): Int = (num1 + num2)

fun squared(number: Int): Int {
    return (number * number)
}

fun main() {
    //Exercise 1
    studying()

    //Exercise 2
    print("Type number 1: ")
    val number1: Int = readln().toInt()
    print("Type number 2: ")
    val number2: Int = readln().toInt()
    println("$number1 + $number2 = ${add(number1, number2)}")

    //Exercise 3
    println("$number1 squared: ${squared(number1)}")
    println("$number2 squared: ${squared(number2)}")

}
