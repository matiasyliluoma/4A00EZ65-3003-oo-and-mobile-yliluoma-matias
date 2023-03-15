fun main() {
    println("give company");
    val stockName : String? = readLine();


    val stock: String? = stockName?.let { giveStock(it) }
    println(stock)
        

}

fun giveStock(stockName: String): String? {

    return when (stockName) {

        "Nokia" -> "NOK".lowercase();
        "Apple" -> "APPL".lowercase();
        "Microsoft" -> "MSFT".lowercase();
        else -> null
    }
}