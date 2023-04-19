// class Person {
//     let age : Int
//     let name : String
// }


class Person {
    private var name : String?

    init(name: String) {
        self.name = name
    }
}

class Programmer : Person {
    private var _salary : Int
    init(name: String, salary : Int) {
       // self.name = name       
        self._salary = salary    
        super.init(name: name)
    }
    var salary: Int {
        set {
            self._salary = salary
        }
        get {
            return _salary
        }
    }
    
    override convenience init(name : String) {
        self.init(name: name, salary: 4000)
    }
}


class PersonA {
    var age : Int = 0
    var name : String = ""
}

class PersonB {
    var age : Int?
    var name : String?
}

class PersonC {
    var age : Int
    var name : String

    init() {
        age = 0
        name = ""
    }
}
func main() {
   // let jaska = Person()

   let jaskaA = PersonA()
   let jaskaB = PersonB()
   let jaskaC = PersonC()

   var jack = Programmer(name: "jack")
   var tina = Programmer(name: "tina")

   print(jack.salary)
   print(tina.salary)

}

main()