package task.kotlin.leetcode75.lvl1

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RunningSumOf1dArrayTest {
    private val testClass: RunningSumOf1dArray = RunningSumOf1dArray()

    @Test
    fun runningSumTest() {
        val arr: IntArray = intArrayOf(1,2,3,4)
        val expected: IntArray = intArrayOf(1,3,6,10)

        Assertions.assertThat(testClass.runningSum(arr)).isEqualTo(expected)
    }
}