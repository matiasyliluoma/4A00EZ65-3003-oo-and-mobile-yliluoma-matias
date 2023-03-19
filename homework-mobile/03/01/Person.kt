
class Person (var name: String)

class Circle (var radius: Int? = null, var color: String? = null) {

    constructor(radius: Int?) : this(radius, null) {

    }
    fun printSurfaceArea() {
        val area : Double = Math.PI * (radius ?: 0) * (radius ?: 0)

        println(area)
    }

    fun attributesToString() {
        val output : String = "radius = ${radius ?: "null"}, color = ${color ?: "null"}"
        println(output)
    }
}

fun main() {
    var jack = Person("jack smith")

    println(jack.name)

    val c = Circle(5,)
    val c2 = Circle()

    println(c.radius)

    println(c2.radius)

    c.printSurfaceArea()

    println(c.attributesToString())

    c2.printSurfaceArea()

    println(c2.attributesToString())

}