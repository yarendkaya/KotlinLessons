package com.yarendemirkaya.kotlinlessons.object_oriented_programming

class Functions {
    var word="Hello"
    var text:String?=null
    lateinit var letter:String //Late-init. Daha sonra değer atanacak demek.//Primitif tipler için calışmaz.

    

    //IOS:protocol(interface) tabanlıdır.
    //Android: fonksiyon tabanlıdır.

    fun sayHi() {
        val result = "Hello Yaren"
        println(result)
    }

    fun sayHi2(): String {
        val result = "Hello Şevval"
        return result
    }

    fun sayHi3(name: String): String {
        return "Hello $name"
    }

    //overloading
    fun plus(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    fun plus(number1: Double, number2: Double): Double {
        return number1 + number2
    }

    fun plus(number1: Int, number2: Int,name:String) {

        println("Name: $name Result: ${number1 + number2}")
    }

}