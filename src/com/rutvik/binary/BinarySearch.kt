package com.rutvik.binary

fun main() {
    val binary = BinarySearch()
    val arr = intArrayOf(-10,-8,-6,-2,1,2,5,6,10,12,19,30,32)

    println(binary.search(arr, 10)) // Output: 8
    println(binary.search(arr, -6)) // Output: 2
    println(binary.search(arr, 15)) // Output: -1 (not found)
}

class BinarySearch {
    fun search(arr: IntArray, target: Int): Int {
        var low = 0
        var high = arr.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (arr[mid] == target) {
                return mid
            } else if (arr[mid] < target) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return -1 // Target not found
    }
}