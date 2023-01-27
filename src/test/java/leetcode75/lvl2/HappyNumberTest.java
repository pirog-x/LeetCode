package leetcode75.lvl2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {
    HappyNumber testClass = new HappyNumber();

    @Test
    void isHappy() {
        int testNum = 19;
        assertTrue(testClass.isHappy(testNum));

        testNum = 2;
        assertFalse(testClass.isHappy(testNum));
    }
}