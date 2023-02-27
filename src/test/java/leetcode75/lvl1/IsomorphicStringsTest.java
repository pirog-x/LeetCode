package leetcode75.lvl1;

import org.junit.jupiter.api.Test;
import task.java.leetcode75.lvl1.IsomorphicStrings;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void isIsomorphic() {
        IsomorphicStrings test = new IsomorphicStrings();

        String s = "egg";
        String t = "add";
        assertTrue(test.isIsomorphic(s, t));

        s = "foo";
        t = "bar";
        assertFalse(test.isIsomorphic(s, t));

        t = "foo";
        s = "bar";
        assertFalse(test.isIsomorphic(s, t));

        t = "paper";
        s = "title";
        assertTrue(test.isIsomorphic(s, t));
    }
}