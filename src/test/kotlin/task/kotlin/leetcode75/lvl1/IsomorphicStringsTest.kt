package task.kotlin.leetcode75.lvl1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class IsomorphicStringsTest {

    val testClass: IsomorphicStrings = IsomorphicStrings()

    @Test
    fun isIsomorphic() {
        // case 1:
        var s: String = "egg"
        var t: String = "add"
        assertTrue(testClass.isIsomorphic(s, t))

        s = "bar"
        t = "foo"
        assertFalse(testClass.isIsomorphic(s, t))
    }
}