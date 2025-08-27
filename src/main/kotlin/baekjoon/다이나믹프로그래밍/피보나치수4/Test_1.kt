package baekjoon.다이나믹프로그래밍.피보나치수4

import java.math.BigInteger

fun main() {
    val n = readln().toInt()

    val dp = Array<BigInteger>(n + 1) { BigInteger.ZERO }

    if (n >= 1) dp[1] = BigInteger.ONE
    if (n >= 2) dp[2] = BigInteger.ONE

    for (i in 3 .. n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    print(dp[n])
}