package task.kotlin.leetcode75.lvl1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class IsSubsequenceTest {

    private val testClass: IsSubsequence = IsSubsequence()

    @Test
    fun isSubsequence() {
        var s = "abc"
        var t = "ahbgdc"
        assertTrue(testClass.isSubsequence(s, t))

        s = "axc"
        t = "ahbgdc"
        assertFalse(testClass.isSubsequence(s, t))
    }
}