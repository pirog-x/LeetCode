package leetcode75.lvl2;

import org.junit.jupiter.api.Test;
import task.java.leetcode75.lvl2.LongestCommonPrefix;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix overClass = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        String[] words = {"flower","flow","flight"};
        String expected = "fl";
        assertEquals(expected, overClass.longestCommonPrefix(words));

        words = new String[]{"dog","racecar","car"};
        expected = "";
        assertEquals(expected, overClass.longestCommonPrefix(words));

        words = new String[]{"ab", "a"};
        expected = "a";
        assertEquals(expected, overClass.longestCommonPrefix(words));
    }
}