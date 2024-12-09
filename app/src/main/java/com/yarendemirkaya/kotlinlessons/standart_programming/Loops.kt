package com.yarendemirkaya.kotlinlessons.standart_programming

fun main() {
    //forEach
    //{1,2,3}

    for (i in 1..3) {
        println(i)
    }

    for (i in 10..20 step 2) {
        println(i)
    }

    for (i in 20 downTo 10 step 2) {
        println(i)
    }

    println("*********")

    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }

    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println(i)
    }
    println("*********")
    //while
    var sayac = 1
    while (sayac < 4) {
        println(sayac)
        sayac++
    }

}