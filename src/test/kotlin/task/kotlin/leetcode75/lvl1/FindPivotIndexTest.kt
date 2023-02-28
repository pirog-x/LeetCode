package task.kotlin.leetcode75.lvl1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FindPivotIndexTest {

    private val testClass: FindPivotIndex = FindPivotIndex()

    @Test
    fun pivotIndex() {
        // case 1:
        val arr: IntArray = intArrayOf(1,7,3,6,5,6)
        val expected = 3
        assertEquals(expected, testClass.pivotIndex(arr))
    }
}