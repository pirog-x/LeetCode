package task.kotlin.leetcode75.lvl1

// https://leetcode.com/problems/is-subsequence
// time: O(n)
// space: O(1)

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isBlank()) return true
        if (t.isBlank() && s.isBlank()) return true
        if (t.isBlank() && s.isNotBlank()) return false

        var sCounter = 0

        for (i in t.indices) {
            if (sCounter == s.length) return true
            if (s[sCounter] == t[i])
                sCounter++
        }
        return sCounter == s.length
    }
}