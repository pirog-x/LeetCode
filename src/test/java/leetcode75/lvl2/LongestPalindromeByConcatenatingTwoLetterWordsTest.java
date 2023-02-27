package leetcode75.lvl2;

import org.junit.jupiter.api.Test;
import task.java.leetcode75.lvl2.LongestPalindromeByConcatenatingTwoLetterWords;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeByConcatenatingTwoLetterWordsTest {

    LongestPalindromeByConcatenatingTwoLetterWords testClass = new LongestPalindromeByConcatenatingTwoLetterWords();

    @Test
    void longestPalindrome() {
        String[] words = {"lc","cl","gg"};
        int expected = 6;
        assertEquals(expected, testClass.longestPalindrome(words));

        words = new String[]{"ab","ty","yt","lc","cl","ab"};
        expected = 8;
        assertEquals(expected, testClass.longestPalindrome(words));

        words = new String[]{"cc","ll","xx"};
        expected = 2;
        assertEquals(expected, testClass.longestPalindrome(words));
    }
}