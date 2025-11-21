//Week 3, Day 3, Exercise 1 to 3

fun main() {
    var fruits = setOf<String>("Apple", "Orange", "Banana")
    fruits.forEach { println(it) }
    try {
        fruits = fruits.toMutableSet()
        fruits.add("Orange")
    }
    finally {
        println("Set elements are unique.")
        fruits.forEach { println(it) }
    }
}
