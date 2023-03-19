open class Person(var name: String) {
    open fun drink() {
        println("$name drinks water")
    }

    fun sleep() {
        println("$name sleeps")
    }

    override fun toString(): String {
        return "Person[name=$name]"
    }
}

class Programmer (name: String, var salary: Int) : Person(name) {
    override fun drink() {
        println("$name drinks energydrink")
    }

    fun codeApps() {
        println("$name code apps")
    }

    override fun toString(): String {
        return "Programmer[name=$name], [salary=$salary]"
    }
}

fun main() {
    val tina = Programmer("tina", 4000)
    // outputs "tina drinks energy drink"
    tina.drink()

    // "tina sleeps"
    tina.sleep()  

    // "tina code apps"
    tina.codeApps()

    // "name = tina, salary = 4000"
    println(tina.toString())

    val jack = Person("jack")

    // "jack drinks water"
    jack.drink()

    // "jack sleeps"
    jack.sleep()

    // "name = jack"
    println(jack.toString())
}
