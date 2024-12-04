package com.yarendemirkaya.kotlinlessons.variables

fun main() {
    val ogrenciAdi = "Yaren"
    val ogrenciYas = 25
    val ogrenciBoy = 1.61
    val ogrenciBasHarf = 'Y'
    val ogrenciDevamDrumu = true

    println("----Öğrenci----")
    println("Adı          : $ogrenciAdi")
    println("Yaşı         : $ogrenciYas")
    println("Boyu         : $ogrenciBoy")
    println("Baş harfi    : $ogrenciBasHarf")
    println("Devam Durumu : $ogrenciDevamDrumu")


    //Constants-Sabitler
    var sayi=30
    println(sayi)
    sayi=40
    println(sayi)

    val sayi2=50
    println(sayi2)
   // sayi2=32

    //type casting

    val d=32.89
    val result=d.toInt()
    println(result)

    val result2=d.toString()
    println(result2)

    val word="34"
    val result3=word.toInt()
    println(result3)
}