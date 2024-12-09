package com.yarendemirkaya.kotlinlessons.object_oriented_programming

fun main() {
    val result = 5.multiply(4)
    println(result)
    val result2 = 5 minus 4
    println(result2)
}

fun Int.multiply(number: Int): Int {
    return this * number
}

infix fun Int.minus(number: Int): Int {
    return this * number
}