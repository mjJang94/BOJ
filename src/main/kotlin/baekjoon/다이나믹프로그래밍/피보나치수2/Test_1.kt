package baekjoon.다이나믹프로그래밍.피보나치수2

fun main() {
    val n = readln().toInt()
    val array = LongArray(n + 1)

    if (n >= 1 ) array[1] = 1
    if (n >= 2 ) array[2] = 1

    for (i in 3..n) {
        array[i] = array[i - 1] + array[i - 2]
    }

    print(array[n])
}