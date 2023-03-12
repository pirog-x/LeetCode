package task.kotlin.interview.easy

// https://leetcode.com/problems/valid-palindrome/
// n = s.length
// time: O(n / 2) => O(n)
// space: O(1)

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        if (s.isBlank()) return true

        var i = 0
        var j = s.length - 1

        while (i <= j) {
            if (s.get(i).uppercaseChar() > 'Z' || s.get(i).uppercaseChar() < '0' ||
                (s.get(i).uppercaseChar() < 'A' && s.get(i).uppercaseChar() > '9')) {
                i++
                continue
            } else if (s.get(j).uppercaseChar() > 'Z' || s.get(j).uppercaseChar() < '0'||
                (s.get(j).uppercaseChar() < 'A' && s.get(j).uppercaseChar() > '9')) {
                j--
                continue
            }

            if (s.get(i++).uppercaseChar() != s.get(j--).uppercaseChar()) {
                return false
            }
        }
        return true
    }
}