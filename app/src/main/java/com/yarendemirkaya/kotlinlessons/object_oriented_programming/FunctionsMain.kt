package com.yarendemirkaya.kotlinlessons.object_oriented_programming

fun main() {

    val newFunction = Functions()
    newFunction.sayHi()
    val result = newFunction.sayHi2()
    println(result)
    val result2 = newFunction.sayHi3("Ahmet")
    println(result2)

    newFunction.plus(5, 8, "yaren")
}
