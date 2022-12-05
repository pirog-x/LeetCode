package leetcode75.lvl1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void isSubsequence() {
        IsSubsequence test = new IsSubsequence();

        String s = "beg";
        String t = "abcdefg";
        assertTrue(test.isSubsequence(s, t));

        s = "axc";
        t = "ahbgdc";
        assertFalse(test.isSubsequence(s, t));

        s = "";
        t = "";
        assertTrue(test.isSubsequence(s, t));

        s = "";
        t = "some";
        assertTrue(test.isSubsequence(s, t));

        s = "some";
        t = "";
        assertFalse(test.isSubsequence(s, t));
    }
}