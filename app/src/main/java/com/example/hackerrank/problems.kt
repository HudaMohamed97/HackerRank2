package com.example.hackerrank

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
    val positiveRatio=positiveNum.toDouble() / arr.size
    val negativeRatio=nativeNumb.toDouble() / arr.size
    val zeroRatio=zeroNum.toDouble() / arr.size
    println("%.6f".format(positiveRatio))
    println("%.6f".format(negativeRatio))
    println("%.6f".format(zeroRatio))
}

fun main() {
    val integers = intArrayOf(-4, 3, -9, 0, 4, 1)
    plusMinus(integers)
}