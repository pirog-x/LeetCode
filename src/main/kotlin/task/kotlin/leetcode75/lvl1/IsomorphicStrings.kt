package task.kotlin.leetcode75.lvl1

// https://leetcode.com/problems/isomorphic-strings/
// time: O(n)
// space: O(n)

class IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        return check(s, t) && check(t, s)
    }

    private fun check(s: String, t: String): Boolean {
        val map = hashMapOf<Char, Char>()

        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                if (map[s[i]] != t[i]) return false
            } else {
                map[s[i]] = t[i]
            }
        }
        return true
    }
}