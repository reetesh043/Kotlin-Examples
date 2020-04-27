package com.reet.kotlin


//Remove First and Last Character of String
fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)

fun main(args: Array<String>) {
    val myString = "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
}