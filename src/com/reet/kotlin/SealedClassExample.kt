package com.reet.kotlin

//All subclasses of a sealed class must be declared in the same file where sealed class is declared.
//A sealed class is abstract by itself, and you cannot instantiate objects from it.
//You cannot create non-private constructors of a sealed class; their constructors are private by default.

//Difference Between Enum and Sealed Class
//Enum class and sealed class are pretty similar. The set of values for an enum type is also restricted like a sealed class.
//The only difference is that, enum can have just a single instance, whereas a subclass of a sealed class can have multiple instances.

sealed class SealedClassExample
class Const(val value: Int) : SealedClassExample()
class Sum(val left: SealedClassExample, val right: SealedClassExample) : SealedClassExample()
object NotANumber : SealedClassExample()


fun eval(e: SealedClassExample): Int =
    when (e) {
        is Const -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        NotANumber -> TODO()
    }