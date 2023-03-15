
fun main() {
    val console = System.console();
    println("give string");
    
    val readText : String = console.readLine();
    var reverse = "";

    for(i in readText.length - 1 downTo 0) {
        reverse += readText[i]
    }

    if(readText == reverse) {
        println("it was palindrome");
    } else {
        println("it wasnt palindrome");
    }    
}