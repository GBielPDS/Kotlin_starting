//Week 2, day 3, exercise 3
fun main() {
    val passWord = "2003"
    print("Password quiz!\n\nGuess the password, it only number and it has 4 digits.\n ->")
    val userGuess = readln()
    if (userGuess == passWord) {
        println("Congratulation! Your guess is right")
    }
    else{
        println("Not this time... the password was '$passWord'")
    }
}