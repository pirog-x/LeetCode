package task.kotlin.leetcode75.lvl1

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RunningSumOf1dArrayTest {
    private val testClass: RunningSumOf1dArray = RunningSumOf1dArray()

    @Test
    fun runningSumTest() {
        // case: 1
        var arr = intArrayOf(1,2,3,4)
        var expected = intArrayOf(1,3,6,10)

        Assertions.assertThat(testClass.runningSum(arr)).isEqualTo(expected)

        // case: 2
        arr = intArrayOf(1,1,1,1,1)
        expected = intArrayOf(1,2,3,4,5)

        Assertions.assertThat(testClass.runningSum(arr)).isEqualTo(expected)

        // case: 3
        arr = intArrayOf(3,1,2,10,1)
        expected = intArrayOf(3,4,6,16,17)

        Assertions.assertThat(testClass.runningSum(arr)).isEqualTo(expected)
    }
}