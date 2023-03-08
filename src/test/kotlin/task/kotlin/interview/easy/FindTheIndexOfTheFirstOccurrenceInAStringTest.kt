package task.kotlin.interview.easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    private val testClass = FindTheIndexOfTheFirstOccurrenceInAString()

    @Test
    fun strStr() {
        var haystack = "sadbutsad"
        var needle = "sad"

        assertEquals(0, testClass.strStr(haystack, needle))

        haystack = "leetcode"
        needle = "leeto"

        assertEquals(-1, testClass.strStr(haystack, needle))
    }

    @Test
    fun strStrBadCase() {
        val haystack = "missaissippi"
        val needle = "issip"

        assertEquals(5, testClass.strStr(haystack, needle))
    }
}