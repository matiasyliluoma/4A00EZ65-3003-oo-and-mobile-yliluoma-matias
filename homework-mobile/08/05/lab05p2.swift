
class Person {
   var name : String = ""
   var age : Int = 0
    init() {
        print("person created") //according to the rule it has
    }

    convenience init() {
        let tina = Person()
    }
}
class Programmer : Person {
}

var jack = Programmer()