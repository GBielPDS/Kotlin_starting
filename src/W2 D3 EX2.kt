//Week 2, day 3, exercise 2
fun main() {
    print("Type your age: ")
    val age: Int = readln().toInt()
    if (age >= 0){
        //age cannot be negative
        if (age < 16) {
            println("You aren't allowed to vote.")
        }
        else if (age >= 60) {
            //in Brazil people in over 59 don't need to vote anymore.
            println("You are allowed to vote, but you don't need to vote.")
        }
        else{
            println("You are allowed to vote.")
        }
    }
    else{
        println("Age must be a positive number.")
    }
}