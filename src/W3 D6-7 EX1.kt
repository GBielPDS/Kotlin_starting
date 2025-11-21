import kotlin.collections.contains

//Week 3, Day 6 and 7, Exercise 1 to 3
//
//fun addContact(list: MutableMap<String,String>, name: String, number:String): MutableMap<String, String>{
//    if (list.contains(name)) {
//        list[name] = number
//        println("$name was registered")
//    }
//    else{
//        println("$name is already registered.")
//    }
//    return (list)
//}
//
//fun search(list: MutableMap<String,String>, name: String): String = list.getOrDefault(name, "Not found")
//
//fun removeContact(list: MutableMap<String,String>, name: String) {
//    if (list.contains(name)) {
//        list.remove(name)
//        println("$name was removed.")
//    }
//    else {
//        println("$name was not found.")
//    }
//}

fun main() {
    val telephones = mutableMapOf<String, String>()
    var menu: Int
    var on = true
    do{
        print("1. add contact \n2. search for a contact \n3. remove contact\n 4. Quit\n --> ")
        menu = readln().toInt()
        when (menu) {
            1 -> {
                print("Type the name: ")
                val name = readln()
                println("Number format: (XX)XXXXX-XXXX")
                print("Type the number: ")
                val number = readln()
                if (telephones.contains(name)) {
                    telephones[name] = number
                    println("$name was registered")
                }
                else{
                    println("$name is already registered.")
                }
            }
            2 -> {
                print("Type the name: ")
                val name = readln()
                telephones.getOrDefault(name, "Not found")
            }
            3 -> {
                print("Type the name: ")
                val name = readln()
                if (telephones.contains(name)) {
                    telephones.remove(name)
                    println("$name was removed.")
                }
                else {
                    println("$name was not found.")
                }
            }
            4 -> {
                on = false
            }
        }
    } while (on)

}
