package com.rutvik.binary

fun main() {
    val binary = OrderAgnosticBinarySearch()
    val ascendingArr = intArrayOf(-10,-8,-6,-2,1,2,5,6,10,12,19,30,32)
    val descendingArr = intArrayOf(32,30,19,12,10,6,5,2,1,-2,-6,-8,-10)

    println(binary.search(ascendingArr, 10)) // Output: 8
    println(binary.search(ascendingArr, -6)) // Output: 2
    println(binary.search(ascendingArr, 15)) // Output: -1 (not found)

    println(binary.search(descendingArr, 10)) // Output: 4
    println(binary.search(descendingArr, -6)) // Output: 10
    println(binary.search(descendingArr, 15)) // Output: -1 (not found)
}

class OrderAgnosticBinarySearch {

    fun search(arr: IntArray, target: Int): Int {
        val isAscending = arr[0] < arr[arr.size -1]
        var low = 0
        var high = arr.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (arr[mid] == target) {
                return mid
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    high = mid - 1
                } else {
                    low = mid + 1
                }
            } else {
                if (target > arr[mid]) {
                    high = mid - 1
                } else {
                    low = mid + 1
                }
            }
        }

        return -1
    }
}