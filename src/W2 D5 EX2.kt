//Week 2, day 5, exercise 2
fun main() {
    var flag: Boolean = true
    var name: String
    var counter = 1
    do {
        print("Type the name $counter: ")
        name = readln()
        println("person $counter's name: $name")
        counter++
        print("Do you want to type more name? \n1.Yes\t2.No\n ->")
        val answer = readln().uppercase()
        if (answer == "NO" || answer == "2") {
            flag = false
            println("Program shut down.")
        }
    } while(flag)
}