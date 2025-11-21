//Week 2, day 6, exercise 1 and 2
fun main() {
    val numList = arrayListOf<Int>()
    for (i in 10 downTo 1) {
        numList.add(i)
    }
    println("Numbers list: $numList\n")

    //exercise 2
    println("Numbers dividable by 5 in 0 until 50: ")
    for (i in 0..50 step 5) {
        if (i % 5 == 0) {
            println(i)
        }
    }
}