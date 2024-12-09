package com.yarendemirkaya.kotlinlessons.standart_programming

fun main() {
    val age = 19
    val name = "Yaren"
    val userName = "yarendemirkaya"
    val password = 123
    val number = 120

    println(age >= 18)

    //If
    if (age >= 18) {
        println("You are an adult")
    } else {
        println("You are not an adult")
    }


    if (name == "Yaren") {
        println("Welcome Yaren")
    } else if (name == "Zeynep") {
        println("Welcome Zeynep")
    } else {
        println("Wrong Name")
    }


    if (userName == "yarendemirkaya" && password == 123) {
        println("Welcome $userName")
    } else {
        println("Wrong Username")
    }


    if (number == 10 || number == 20) {
        println("Number is 10 or 20.")
    } else {
        println("Number is not 10 or 20.")
    }

    //When
    val x = 1
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> println("x is not 1 or 2")
    }
}