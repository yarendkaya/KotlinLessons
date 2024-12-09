package com.yarendemirkaya.kotlinlessons.object_oriented_programming

fun main() {
    //Creating instance
    val movie1 = Movies(1, "The Shawshank Redemption", 9.99)
    val movie2 = Movies(2, "The Godfather", 8.99)

    movie1.movieInfo()

    movie1.price = 99.99

    movie2.movieInfo()
    movie1.movieInfo()


}