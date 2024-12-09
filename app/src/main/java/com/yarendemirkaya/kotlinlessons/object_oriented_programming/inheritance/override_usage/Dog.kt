package com.yarendemirkaya.kotlinlessons.object_oriented_programming.inheritance.override_usage

class Dog : Mammal() {
    override fun makingNoise() {
        println("Hav hav")
    }
}