package task.kotlin.interview.easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ValidPalindromeTest {

    val testClass = ValidPalindrome()

    @Test
    fun isPalindrome() {
        var s = "A man, a plan, a canal: Panama"
        assertTrue(testClass.isPalindrome(s))

        s = "race a car"
        assertFalse(testClass.isPalindrome(s))

        s = " "
        assertTrue(testClass.isPalindrome(s))
    }
}