package com.yarendemirkaya.kotlinlessons.object_oriented_programming

fun main() {
    //Nullable- Null safety
    //? -> eğer değişkenin değeri null ise crash atmaz.
    //!! -> bunun null gelmeyeceğini garanti ediyorsun.


    var word: String? = null
    word = "word"
    println(word?.uppercase())

    println(word!!.uppercase())

    if (word != null) {
        println(word.uppercase())
    } else {
        println("word is null")
    }

    word?.let {
        println(it.uppercase())
    }
}