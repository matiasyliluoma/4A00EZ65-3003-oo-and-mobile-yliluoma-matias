// A

fun sum(a: Int, b: Int, msg: (String) -> Unit) {
    val result = a + b
    msg("Result was $result")
}

// B


fun isPositive(a: Int, success: (String) -> Unit, err: (String) -> Unit) {
    if(a > 0) {
        success("it was positive")
    } else {
        err("it wasnt positive")
    }
}

fun isPositiveTwo(a: Int, pos: (success: String) -> Unit, err: (error: String) -> Unit) {
    if(a > 0) {
        pos("it was positive")
    } else {
        err("wasn't positive")
    }
}


fun main() {

    // A
    sum(4,5, { msg -> println(msg) } )


    sum(4,5) { msg ->
        println(msg)
    }

    sum(4,5) { 
        println(it)
    }

    // B

    isPositive(-1, 
        { success -> println(success) },
        { err -> println(err) })

    isPositiveTwo(-5, { success -> 
        println(success)
    }) { error ->
        println(error)
    }

}