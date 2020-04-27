package com.reet.kotlin


// Empty primary constructor
open class OverrideExample() {
    open fun displayAge(age: Int) {
        println("My age is $age.")
    }
}

class Person : OverrideExample() {

    override fun displayAge(age: Int) {
        // calling function of base class
        super.displayAge(age)
        println("My fake age is ${age - 5}.")
    }
}

fun main(args: Array<String>) {
    val obj = Person()
    val obj1 = OverrideExample()

    obj.displayAge(30)
    obj1.displayAge(30)
}