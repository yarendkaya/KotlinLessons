package com.yarendemirkaya.kotlinlessons.object_oriented_programming

data class Movies(
    var id: Int,
    var name: String,
    var price: Double
) {

    init {
        println("Movie object created.")
    }

    fun movieInfo() {
        println("---------------------------------------------")
        println("Movie ID: $id")
        println("Movie Name: $name")
        println("Movie Price: $price ₺")
    }

    //this: Bulunduğu sayfayı temsil eder.
    //side effect:Bir metod ile sınıf değişkenlerini değştirmek.

}