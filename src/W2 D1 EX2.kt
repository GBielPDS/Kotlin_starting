//Week 4, Day 1,  Exercise 2
fun main() {
    print("Type a number: ")
    val number: Int = readln().toInt()
    if (number % 2 == 0) {
        print("$number is pair")
    }
    else {
        print(("$number is odd"))
    }
}