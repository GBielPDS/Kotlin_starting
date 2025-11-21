//Week 2, day 6, exercise 3
fun main() {
    var addition: Int = 0
    for (i in 1..5) {
        print("Type number $i: ")
        addition += readln().toInt()
    }

    println("The addition of all numbers: $addition")
}