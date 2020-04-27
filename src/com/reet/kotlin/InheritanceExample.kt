package com.reet.kotlin

open class InheritanceExample(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): InheritanceExample(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }
}

class Footballer(age: Int, name: String): InheritanceExample(age, name) {
    fun playFootball() {
        println("I play for LA Galaxy.")
    }
}

fun main(args: Array<String>) {
    val t1 = MathTeacher(30, "Reetesh")
    t1.teachMaths()

    println()

    val f1 = Footballer(30, "Kumar")
    f1.playFootball()
}