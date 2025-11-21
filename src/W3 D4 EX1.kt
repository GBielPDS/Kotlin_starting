//Week 3, Day 4, Exercise 1 to 3

fun main() {
    val id = mutableMapOf("Name" to "Gabriel", "Age" to 21)
    for ((key, value) in id) {
        println("$key: $value")
    }
    print("Type the new age: ")
    id["Age"] = readln().toInt()
    print("Type the new name: ")
    id["Name"] = readln()

    println("Id updated.")
    for ((key, value) in id) {
        println("$key: $value")
    }
}
