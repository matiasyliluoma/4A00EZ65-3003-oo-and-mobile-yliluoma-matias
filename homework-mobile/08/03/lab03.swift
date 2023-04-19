class Mammal {
    var weight : Double = 0
}

class Dog : Mammal {
    var name : String?

    func bark() {
        if let name = name {            
            print("\(name) barking")
        } else {
            print("barking")
        }
    }
}

class Human : Mammal {
    var name : String?

    func createArt() {
        if(name == nil) {
            print(name)
        } else {            
            print("\(name) creates art")
        }
    }    
}

func printWeight(mammal: Mammal) {
    if let spot = mammal as? Dog {        
        print("weights \(mammal.weight)")
        spot.bark()
    } else if let matias = mammal as? Human {
        print("weights \(mammal.weight)")
        matias.createArt()
    }
}

func main() {
    
    let spot = Dog()
    spot.name = "Spot"
    spot.weight = 50
    spot.bark()

    let matias = Human()
    matias.name = "matias"
    matias.weight = 78
    matias.createArt()
    
    printWeight(mammal: spot)
    printWeight(mammal: matias)
}

main()