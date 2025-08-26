package baekjoon.다이나믹프로그래밍.부녀회장이될테야


/**
 * input
 * 2 갯수
 * 1 층수
 * 3 호수
 * 2
 * 3
 *
 * 제한 1 ≤ k, n ≤ 14
 */

fun main() {
    val t = readln().toInt()
    val dp = Array(15) { IntArray(15) }

    for (i in 1..14) dp[0][i] = i
    for (k in 1..14) {
        for (n in 1..14) {
            dp[k][n] = dp[k][n - 1] + dp[k - 1][n]
        }
    }

    repeat(t) {
        val k = readln().toInt() //층수
        val n = readln().toInt() //호수
        println(dp[k][n])
    }
}




