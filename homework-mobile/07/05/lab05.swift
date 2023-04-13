// a

let arguments = CommandLine.arguments


let asd = arguments[1]

let muuttumaton = asd
var muuttuva = asd

let 🫶 = "terve 🫶"

//muuttumaton = "haloja" this will not work after giving a value at command line

/*
swift lab05.swift blaa
lab05.swift:11:1: error: cannot assign to value: 'muuttumaton' is a 'let' constant
muuttumaton = "haloja"
^~~~~~~~~~~
lab05.swift:6:1: note: change 'let' to 'var' to make it mutable
let muuttumaton = asd
^~~
var
*/
print(muuttumaton)

muuttuva = "terveee"
print(muuttuva)

print(🫶)


//b

let x : Int = 5
let y : Double = 5.1

let yToInt = Int(y.rounded())

print(x+yToInt)

//c

let decomposeTuple : (a: Int, b: Double) = (a: 1, b: 1.5)

let (a, _) = decomposeTuple

let address = (line: "Hämeenkatu", city: "Tampere", postalcode: "33100", country: "Finland")
let information: (name: String, address: (line: String, city: String, postalcode: String, country: String)) = ("Jack", address)


print(information)

//d

let maxInt = Int.max // 9223372036854775807
let minInt = Int.min // -9223372036854775808

print(maxInt, minInt)

var maxUInt8 = UInt8.max //255

//var maxUInt8Plus = UInt8.max + 1
//print(maxUInt8Plus) // lab05.swift:63:30: error: arithmetic operation '255 + 1' (on type 'UInt8') results in an overflow var maxUInt8Plus = UInt8.


let i = 8
let p = -8

let result = i.distance(to: p)

print(result)

let m = abs(maxInt)

print(m)