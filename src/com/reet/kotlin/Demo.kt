package com.reet.kotlin

class Demo {

    private var a: Int = 0
    private var b: String? = null

    fun print(){
        a=1
        b="hello world"
        println("$a" + " " + "$b")
    }

    fun returnValue(c: Int): Int{
        return c
    }
}

fun main(args: Array<String>){
    val d = Demo()
    d.print()
    println(d.returnValue(123))
}