struct Circle {
    private var _radius : Double = 0

    init(radius: Double) {
        self.radius = radius    
    }

    var radius: Double {
        set {

            if(newValue >= 0) {
                _radius = newValue
            } else {
                _radius = 0
            }
        }

        get {
            return _radius
        }
    }

    var surfaceArea: Double {
        return radius*radius*Double.pi
    }
}

let myCircle1 = Circle(radius: 2.5)

print(myCircle1.surfaceArea)

let myCircle2 = Circle(radius: -2)

print(myCircle2.surfaceArea)
