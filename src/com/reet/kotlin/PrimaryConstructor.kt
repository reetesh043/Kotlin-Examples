package com.reet.kotlin

class PrimaryConstructor(var firstName: String, var lastName: String, val age: Int) {
}

fun main(args: Array<String>) {

    val obj = PrimaryConstructor("Reetesh", "Kumar", 30)

    println("First Name = ${obj.firstName}")
    println("Last Name = ${obj.lastName}")
    println("Age = ${obj.age}")
}