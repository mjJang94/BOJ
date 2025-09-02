package baekjoon.다이나믹프로그래밍.피보나치수

fun main() {
    val n = readln().toInt()

    if (n == 0) {
        println(0)
        return
    }

    var a = 0
    var b = 1

    repeat(n - 1) {
        val temp = a + b
        a = b
        b = temp
    }

    println(b)
}