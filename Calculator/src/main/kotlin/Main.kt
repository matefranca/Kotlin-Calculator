fun main(args: Array<String>) {
    println("Welcome to my Kotlin calculator.")
    println("For using it just input two numbers and then choose an operation.")

    var number1:Int?
    var number2:Int?
    var operation:Int

    println("What is the first number?")
    number1 = readLine()?.toInt() ?: 0

    println("What is the second number?")
    number2 = readLine()?.toInt() ?: 0

    println("Now what is the operation?")
    println("0 - summ, 1 - subtraction, 2 - multiplication, 3 - division")
    operation = readln().toInt()

    calculate(number1, number2, operation)
}

fun calculate(a:Int, b:Int, op:Int){
    print("Your result is: ")

    when(op){
        0 -> println(a + b)
        1 -> println(a - b)
        2 -> println(a * b)
        3 -> println(a / b)
        else -> println("Wrong operation chosen.")
    }
}