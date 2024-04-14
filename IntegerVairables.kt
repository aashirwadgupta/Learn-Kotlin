package basics

fun main() {
    var day : Int = 1
    println("Start Day - $day")
    day + 1
    day++
    println("It has been $day days")

    val bufferDays = 10
    println("Total days $day + $bufferDays")
    println("Total days {$day + $bufferDays}")
    // completely changes the above and below just by using the $ symbol at correct place
    println("Total days ${day + bufferDays}")
}