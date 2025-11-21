//Week 1, Day 4,  Exercise 1 to 3
fun main() {
    print("Type your name: ")
    val name = readln()
    println("Name: $name")

    print("Type number 1: ")
    var num = readln().toInt()
    print("Type number 2: ")
    num = num + readln().toInt()
    println("Average: ${num / 2.0}")
    //Only integers numbers divide result an integer type answer
    //one float number will make a double type answer

    print("Type your age: ")
    val age = readln().toInt()
    println("Your age after 5 years: ${age + 5}")
}