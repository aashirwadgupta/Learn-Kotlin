fun main() {
    val a = 10
    var b = 20

    val max = if (a > b) a else b
    println(max)
    whenChecks(max)
}

fun whenChecks(x : Int) {
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // default condition - Similar to default in Java's switch case
            print("x is neither 1 nor 2")
        }
    }
}