package com.yarendemirkaya.kotlinlessons.object_oriented_programming

fun main() {
    price(5, Konserve.LARGE)
}

fun price(count: Int, size: Konserve) {
    when (size) {
        Konserve.SMALL -> println("Price: ${count * 10}")
        Konserve.MEDIUM -> println("Price: ${count * 15}")
        Konserve.LARGE -> println("Price: ${count * 20}")
    }
}