class PointC : Equatable {
    var x: Int = 0
    var y: Int = 0


    static func == (left: PointC, right: PointC) -> Bool {
        return (left.x == right.x)
    }
}
let r = PointC()
let t = PointC()

r.x = 1
r.y = 2

t.x = 1
t.y = 4

print(r == t)

print(r === t)
struct PointS : Equatable {
    var x: Int = 0
    var y: Int = 0


    // static func == (left: PointS, right: PointS) -> Bool {
    //     return (left.x == right.x)
    // }
}

//let a = PointC()
//let b = PointS()
//let b = PointC()
//let b = a


let a = PointS(x: 0, y: 8)
let b = PointS(x: 0, y: 9)
print(a == b)


// A)
// var referenceA = a
// var copyB = b

// referenceA.x = 1
// referenceA.y = 1

// copyB.x = 2
// copyB.y = 2

// print("Originals: A: \(a.x) \(a.y) B: \(b.x) \(b.y) Modified: Reference type: \(referenceA.x) \(referenceA.y) Value type: \(copyB.x) \(copyB.y)")

// let test1 = PointS(x: 0, y: 1)

// print("x = \(test1.x) y = \(test1.y)")

// B)

//print(a === b) // false --  b = a true

//lab01.swift:37:7: error: argument type 'PointS' expected to be an instance of a class or class-constrained type
//print(a === b) // false --  b = a true
//lab01.swift:37:13: error: argument type 'PointS' expected to be an instance of a class or class-constrained type
//print(a === b) // false --  b = a true


