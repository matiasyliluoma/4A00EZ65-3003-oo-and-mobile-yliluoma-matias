

fun main() {
    
    // println("give number");
    // val number = readLine();
    println("give name");
    val name : String? = readLine();
    
    // println(number);
    // println(chars);
    println("number")
    val value : String? = readLine()
    // val valueInt : Int = if (value != null) value.toInt() else -1
    // errors with non numeric
    val myValueInt: Int? = value?.toIntOrNull()
    // println(valueInt) // its null if non-numeric

    if(myValueInt != null) {
        val amount : Int = myValueInt

        for(i in 1..amount) {
            print(name)
        }
    }
}
