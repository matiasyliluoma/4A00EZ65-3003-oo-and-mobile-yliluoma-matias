
fun main(arguments: Array<String>) = println(arguments.filter { it.length >= 5 }.map { it.uppercase() })
    // implement in one line
   // if(arguments.size >= 1) println(arguments.joinToString(separator = " "))
