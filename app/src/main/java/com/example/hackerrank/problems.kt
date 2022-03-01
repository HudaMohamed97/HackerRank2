package com.example.hackerrank

fun fizzBuzz(n: Int): Unit {
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println("" + i)
        }

    }
}

fun plusMinus(arr: IntArray) {
    var positiveNum = 0
    var nativeNumb = 0
    var zeroNum = 0
    for (i in arr.indices) {
        when {
            arr[i] < 0.0 -> {
                nativeNumb++

            }
            arr[i] > 0.0 -> {
                positiveNum++
            }
            else -> {
                zeroNum++
            }
        }
    }
    val positiveRatio = positiveNum.toDouble() / arr.size
    val negativeRatio = nativeNumb.toDouble() / arr.size
    val zeroRatio = zeroNum.toDouble() / arr.size
    println("%.6f".format(positiveRatio))
    println("%.6f".format(negativeRatio))
    println("%.6f".format(zeroRatio))
}

fun miniMaxSum(arr: IntArray): Unit {
    var maxValue:Long = 0
    var minValue:Long = 0
    val array = arr.sortedArray()
    for (i in 0 until array.size - 1) {
        minValue += array[i]
    }
    for (i in 1 until array.size) {
        maxValue += array[i]
    }
    println("min$minValue" + "max" + maxValue)
}


fun main() {
    val integers = intArrayOf(-4, 3, -9, 0, 4, 1)
    //  plusMinus(integers)
    // fizzBuzz(15)
   // val array = intArrayOf(7, 69, 2, 221, 8974)
    val array = intArrayOf(256741038, 623958417, 467905213, 714532089, 938071625)
    miniMaxSum(array)

}