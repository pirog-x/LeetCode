package task.kotlin.interview.easy

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Knuth-Morris-Prat KMP solution
// n = haystack.length
// m = needle.length
// time: O(n + m)
// space: O(m)

class FindTheIndexOfTheFirstOccurrenceInAString {
    fun strStr(haystack: String, needle: String): Int {
        if (needle == "") return 0

        val lps = Array<Int>(needle.length) {0}
        var prevLps = 0
        var i = 1

        while (i < needle.length) {
            if (needle[i] == needle[prevLps]) {
                lps[i++] = ++prevLps
            } else if (prevLps == 0) {
                lps[i++] = 0
            } else {
                prevLps = lps[prevLps - 1]
            }
        }

        i = 0  // haystack
        var j = 0  // needle

        while (i < haystack.length) {
            if (haystack[i] == needle[j]) {
                i++
                j++
            } else {
                if (j == 0) {
                    i++
                } else {
                    j = lps[j - 1]
                }
            }
            if (j == needle.length) {
                return i - needle.length
            }
        }
        return -1
    }


//// brute force solution
//// n = haystack.length
//// m = needle.length
//// time: O(n * m)
//// space: O(1)
//    fun strStr(haystack: String, needle: String): Int {
//        var ptr = 0
//        for (i in haystack.indices) {
//            if (needle[0] == haystack[i]) {
//                var j = i
//                while (needle[ptr] == haystack[j]) {
//                    ptr++
//                    j++
//                    if (ptr >= needle.length) {
//                        return j - ptr
//                    }
//                }
//                ptr = 0
//            }
//        }
//        return -1
//    }
}
