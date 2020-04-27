package com.reet.kotlin


abstract class AbstractClass(name: String) {

    init {
        println("My name is $name.")
    }

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String) : AbstractClass(name) {

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    val jack = Teacher("Reetesh Kumar")
    jack.displayJob("I'm a mathematics teacher.")
    jack.displaySSN(23123)
}