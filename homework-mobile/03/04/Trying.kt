data class Person(var name : String, var age : Int)



fun main() {

    val jack1 = Person("jack", 30)
    val jack2 = Person("jack", 30)

    // equals = compares hashcodes, false
    // toString = outputs the hashcodes of the objects

    println(jack1.equals(jack2)) // compares now the attributes, true
    println(jack1.toString()) // jack, 30
    println(jack2.toString()) // jack, 30

}