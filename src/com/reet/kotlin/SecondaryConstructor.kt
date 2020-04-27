package com.reet.kotlin


fun main(args: Array<String>) {

    val obj = InheritedSecondaryConstructor("HELLO")
    val obj1 = SecondaryConstructor("From SecondaryConstructor -> " + "Hello")

}

open class SecondaryConstructor {
    var data: String = ""
    var numberOfData = 0

    constructor(_data: String) {
        this.data = _data
        println("$data: $numberOfData times")
    }

    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class InheritedSecondaryConstructor : SecondaryConstructor {
    constructor(_data: String) : this("From InheritedSecondaryConstructor -> " + _data, 10) {
    }

    constructor(_data: String, _numberOfData: Int) : super(_data, _numberOfData) {
    }
}