//Week 2, Day 7, Exercise 1 to 3

fun exercise1(number:Int) =
    "$number X 0 = 0\n" +
    "$number X 1 = $number\n" +
    "$number X 2 = ${number*2}\n" +
    "$number X 3 = ${number*3}\n" +
    "$number X 4 = ${number*4}\n" +
    "$number X 5 = ${number*5}\n" +
    "$number X 6 = ${number*6}\n" +
    "$number X 7 = ${number*7}\n" +
    "$number X 8 = ${number*8}\n" +
    "$number X 9 = ${number*9}\n" +
    "$number X 10 = ${number*10}\n"

fun exercise2(word:String):Int {
    var vowel:Int = 0
    for (letter in word.uppercase()) {
        if (letter in "AEIOU") {
            vowel ++
        }
    }
    return vowel
}

fun exercise3(number: Int): Boolean {
    if (number == 3){
        return true
    }
    else {
        return false
    }
}

fun main() {
    println("--- Exercise 1 ---")
    print("Type a number: ")
    val numberTable = readln().toInt()
    println(exercise1(numberTable))

    //Exercise 2
    println("--- Exercise 2 ---")
    print("Type a word: ")
    val userWord = readln()
    val vowel = exercise2(userWord)
    println("the word $userWord has $vowel vowel(s).\n")

    //Exercise 3
    println("--- Exercise 3 ---")
    var flag = false
    var guess:Int
    println("Let's play guess the number 1 to 10!")
    while (!flag) {
        print("Do your guess: ")
        guess = readln().toInt()
        flag = exercise3(guess)
        if (flag) {
            println("Congratulation!")
        }
        else {
            println("Wrong guess, it's not $guess")
        }
    }
}
