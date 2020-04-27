package com.reet.kotlin


class CompanionObjectExample {

    //companion object Test {
   //     fun callMe() = println("I'm called.")
    //}

    // name of the companion object is omitted
    companion object {
        fun callMe() = println("I'm called.")
    }
}

fun main(args: Array<String>) {
    CompanionObjectExample.callMe()
}