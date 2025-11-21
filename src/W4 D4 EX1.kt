//Week 4, Day 4, Exercise 1 to 3

class User(var name: String, var age: Int=20) {

}

fun main() {
    //Exercise 1
    print("Type your name: ")
    val name: String? = readln()
    val first = name?.let{
        println("First name letter: ${it[0]}")
    }

    //Exercise 2
    val u1 = User("Gabriel")
    val description = u1.run {
        println("Name: ${this.name}\nAge: $age")
    }

    //Exercise 3
    u1.apply {
        this.name = "GB"
        val id = 1
        var email = "${this.name}@email.com"
    }
    println(u1.name)
}