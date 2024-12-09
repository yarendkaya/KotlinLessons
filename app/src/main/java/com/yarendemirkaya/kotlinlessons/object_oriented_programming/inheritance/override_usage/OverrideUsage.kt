package com.yarendemirkaya.kotlinlessons.object_oriented_programming.inheritance.override_usage

fun main() {
    val animal = Animal()
    val mammal = Mammal()
    val cat = Cat()
    val dog = Dog()


    animal.makingNoise()//No inheritance. It reaches its own method.
    mammal.makingNoise()//Inheritance. But it reaches super class function.
    cat.makingNoise()//Inheriteance. It reaches its own method.
    dog.makingNoise()//Inheriteance. It reaches its own method.

    //upCasting downCasting?

}