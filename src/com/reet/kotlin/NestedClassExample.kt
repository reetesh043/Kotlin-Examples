package com.reet.kotlin

class NestedClassExample {

    val a = "Outside Nested class."

    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    // accessing member of Nested class
    println(NestedClassExample.Nested().b)

    // creating object of Nested class
    val nested = NestedClassExample.Nested()
    println(nested.callMe())
}