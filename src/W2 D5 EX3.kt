//Week 2, day 5, exercise 3
fun main() {
    val password = 2003
    println("Password quiz!\n\nGuess the password, it only number and it has 4 digits.")
    var userGuess: Int
    var counter = 0
    var flag = true
    do{
        counter ++
        print("attempt $counter\nTry to guess: ")
        userGuess = readln().toInt()
        when (userGuess) {
            password -> {
                if (counter == 1) {
                    println("Congratulation! at the first try.")
                }
                else {
                    println("Congratulation! Your guess is right, it was $password")
                }
                flag = false
            }
            else -> {
                println("Not this time... Try again")
            }
        }
    } while (flag)
}