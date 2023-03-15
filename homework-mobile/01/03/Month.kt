import java.time.LocalDate;
fun main() {
    val current = LocalDate.now();
    val month = current.getMonthValue();
    val days = when (month) {
        2 -> if (current.isLeapYear()) 29 else 28
        4, 6, 9, 11 -> 30
        else -> 31
    }
    println("Number of days in current month: $days")
}