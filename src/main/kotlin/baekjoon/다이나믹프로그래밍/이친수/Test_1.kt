package baekjoon.다이나믹프로그래밍.이친수

fun main() {
    val n = readln().toInt()
    val dp = LongArray(n + 2)

    dp[1] = 1
    dp[2] = 1

    for (i in 3..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    println(dp[n])
}