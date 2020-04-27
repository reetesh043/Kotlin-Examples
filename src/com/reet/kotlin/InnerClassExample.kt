package com.reet.kotlin

class InnerClassExample {

    val a = "Outside Nested class."

    inner class Inner {
        fun callMe() = a
    }
}

fun main(args: Array<String>) {

    val outer = InnerClassExample()
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = InnerClassExample().Inner()
    println("Using inner object: ${inner.callMe()}")
}