package com.reet.kotlin

class InitializationBlock(_firstName: String = "UNKNOWN", _age: Int = 0) {
    val firstName: String = _firstName.capitalize()
    var age: Int = _age

    // initializer block
    init {
        println("First Name = $firstName")
        println("Age = $age")
    }
}

fun main(args: Array<String>) {
    val obj = InitializationBlock("reetesh", 30)
    val obj1 = InitializationBlock("reetesh")
    val obj2 = InitializationBlock()
}
