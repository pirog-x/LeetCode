package task.kotlin.interview.easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SingleNumberTest {

    val testClass = SingleNumber()

    @Test
    fun singleNumber() {
        var nums: IntArray = intArrayOf(2,2,1)
        var expected = 1
        assertEquals(expected, testClass.singleNumber(nums))

        nums = intArrayOf(4,1,2,1,2)
        expected = 4
        assertEquals(expected, testClass.singleNumber(nums))
    }
}