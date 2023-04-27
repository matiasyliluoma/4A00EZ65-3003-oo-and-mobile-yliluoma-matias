//
//  main.swift
//  Lab
//
//  Created by Matias Yliluoma on 20.4.2023.
//

import Foundation




protocol Flyable<T> {
    associatedtype T
    // one must have power but it's type "unknown"
    var power : T { get set }
    func fly() -> Void
}

struct Bird : Flyable {
    var power : Double
    func fly() -> Void{
        print("bird is flying with the speed of \(power)")
    }
}

struct Airplane : Flyable {
    var power : Int
    func fly() -> Void {
        print("airplane is flying with the speed of \(power)")
    }
}

func giveFlyable() -> some Flyable {
    Bird(power: 1.1)
}



var f = giveFlyable()
// f = Airplane()
f.fly()

//var x : Int {
//    5
//}

var x : some Flyable {
    Bird(power: 5.5)
}
print(x)
// View = protocol
