package com.rutvik.linear

fun main() {
    val array = intArrayOf(1025,515,54,4,445,42,28,6,547,5,56,55)
    val search = LinearSearch()
    println(search.countOfEventDigitNumbers(array))
    println(search.countOfEventDigitNumbers2(array))
}

class LinearSearch {
//    Find the count of the even number of digits in array

    fun countOfEventDigitNumbers(numbers: IntArray): Int {
        var count = 0
        for (number in numbers) {
            if (number.toString().length % 2 == 0) {
                count++
            }
        }
        return count
    }

    fun countOfEventDigitNumbers2(numbers: IntArray): Int {
        var count = 0
        for (number in numbers) {
            if (isEvenNumber(number)) {
                count++
            }
        }
        return count
    }

    fun isEvenNumber(number: Int): Boolean {
        var count = 0
        var num = number
        while (num > 0) {
            num %= 10
            count++
        }
        return count % 2 == 0
    }
}