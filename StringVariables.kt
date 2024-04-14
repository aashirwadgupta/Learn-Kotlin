package basics

fun main() {
    val firstName : String = "Aashirwad"
    val lastName : String = "Gupta"
    println("Hello "+ firstName)
    //Can also be defined like
    val fullName = "Aashirwad Gupta"
    println("Hello " + fullName)

    //now the concatenation done in line 3 and line 6 can also be done as
    println("Hello $firstName")
    println("Hello $fullName")

    //And if we wish to concatenate the two strings before printing, we can do it like

    println("Hello $firstName $lastName")

    //If we try to do below the compiler will start complaining and program won't compile
    //name = "IntelliJ"
    //fullName : String = "JetBrains tool"
}