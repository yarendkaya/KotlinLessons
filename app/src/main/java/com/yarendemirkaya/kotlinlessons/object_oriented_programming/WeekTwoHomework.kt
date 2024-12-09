package com.yarendemirkaya.kotlinlessons.object_oriented_programming

fun main() {
    println(calculateAngle(4))
    println(calculateSalary(20))
    println(parkingFee(4))
    println(toMile(4))
    println(calculateRectangleArea(3, 9))
    println(calculateFactorial(4))
    println(findLetter("yaren"))
}

fun calculateAngle(edgeNumber: Int): Int {
    return ((edgeNumber - 2) * 180) / edgeNumber
}

fun calculateSalary(dayNumber: Int): Int {
    val workingHours = dayNumber * 8
    if (workingHours <= 150) {
        return workingHours * 40
    } else {
        return (150 * 40) + ((workingHours - 150) * 80)
    }
}

fun parkingFee(parkingTime: Int): Int {
    if (parkingTime == 1) {
        return 50
    } else {
        return 50 + ((parkingTime - 1) * 10)
    }
}

fun toMile(km: Int): Double {
    return km * 0.621
}


fun calculateRectangleArea(longEdge: Int, shortEdge: Int): Int {
    return longEdge * shortEdge
}


fun calculateFactorial(number: Int): Int {
    if (number < 0) {
        println("Please enter a valid number.")
        return -1
    }

    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}


fun findLetter(word: String): Int {

    val newWord = word.toCharArray()
    val count = newWord.count { it == 'e' }
    return count
}






