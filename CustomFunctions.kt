package basics

fun main() {
    sayHello()

    //Doing this prints something like as below
    //println(basics.sayHello())
    //kotlin.Unit - need to learn about this in future

    birthdayGreeting()

    println(fakeBirthdayGreeting(age = 10))
    //Above is where we explain why in the step 5 kotlin.unit was printed.
    //as we are printing twice and second time nothing was there to print apart from the default return type
    //of the function, i.e. Unit

    println(todayIsWhichDay())

    val doWhat = whatShouldWeDo()
    var dayToday = todayIsWhichDay()
    println("Today is $dayToday and $doWhat")
    println("We should "+ purchaseSomething("groceries"))
    println("We should also "+ purchaseMultipleItems("cookware", 50, "oranges"))
}

fun sayHello() {
    println("Hello Aashirwad!")
}

fun birthdayGreeting(): Unit {
    println("Happy Birthday, Aashirwad!")
}

//If we do not use return statement, with any other return DataType apart from Unit, execution will fail.
fun todayIsWhichDay() : String {
    return "Sunday"
}

fun whatShouldWeDo() : String {
    return "We should go to a mall"
}

fun purchaseSomething(item : String) : String {
    return "purchase $item"
}

fun purchaseMultipleItems(item : String, item2Quantity: Int, item2 : String) : String{
    return "purhase some $item, and $item2Quantity $item2"
}

fun fakeBirthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}