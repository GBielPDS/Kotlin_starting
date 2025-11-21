//Challenge
//1. Adicionar item
//2. Remover item
//3. Mostrar lista
//4. Verificar se um item está na lista
//5. Sair

//Requisitos:
//A lista deve ser uma mutableListOf<String>()
//O programa deve rodar em loop até o usuário escolher a opção 5.
//Ao adicionar um item, peça o nome e adicione à lista.
//Ao remover, peça o nome do item. Se ele não estiver na lista, informe isso ao usuário.
//Ao verificar um item, diga se ele está ou não na lista.
//Use when, readln(), contains(), remove() e toLowerCase()
//para ignorar diferenças de caixa ao verificar/remover.

fun main() {
    val itemList = mutableListOf<String>()
    do {
        print(
            "1. Add item\n" +
            "2. Remove item\n" +
            "3. Show list\n" +
            "4. Verify item in list\n" +
            "5. Exit \n ->")
        val menu: Int = readln().toInt()

        when (menu) {
            1 -> {
                print("Item name: ")
                val item = readln().lowercase()
                itemList.add(item)
                println("Item \"$item\" was added.")
            }
            2 -> {
                print("Item name: ")
                val item = readln().lowercase()
                if (item in itemList) {
                    itemList.remove(item)
                    println("Item \"$item\" was removed.")
                }
                else {
                    println("Item \"$item\" is not in the List.")
                }
            }
            3 -> {
                println("Item List:")
                var position = 1
                itemList.forEach {
                    println("$position: $it")
                    position ++
                }
            }
            4 -> {
                print("Which item do you want to search: ")
                val item = readln().lowercase()
                if (itemList.contains(item)) {
                    println("Item \"$item\" is in list.\nPosition: ${itemList.indexOf(item) + 1}")
                }
                else{
                    println("Iem \"$item\" is not in list.")
                }
            }
            5 -> {
                println("System shut down.")
                break
            }
            else -> {
                println("Command invalid.\nplease, type only number on menu.")
            }
        }

    } while (true)
}