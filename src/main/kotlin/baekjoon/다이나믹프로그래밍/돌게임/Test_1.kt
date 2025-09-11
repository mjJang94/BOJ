package baekjoon.다이나믹프로그래밍.돌게임

fun main() {
    val n = readln().toInt()
    val dp = BooleanArray(n + 1) { false }

    for (i in 1..n) {
        if (i - 1 >= 0 && !dp[i - 1]) dp[i] = true
        if (i - 3 >= 0 && !dp[i - 3]) dp[i] = true
    }

    println(if (dp[n]) "SK" else "CY")
}