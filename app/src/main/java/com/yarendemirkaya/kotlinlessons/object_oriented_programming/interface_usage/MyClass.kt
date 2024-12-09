package com.yarendemirkaya.kotlinlessons.object_oriented_programming.interface_usage

class MyClass : MyInterface {
    override val variable: Int = 10

    override fun method1(): String {
        return "Method 1 is working."
    }

    override fun method2() {
        println("Method 2 is working.")
    }
}