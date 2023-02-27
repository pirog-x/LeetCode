package array_problems;

import org.junit.jupiter.api.Test;
import task.java.array_problems.JumpGame;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    JumpGame testClass = new JumpGame();

    @Test
    void testSingleArrays() {
        int[] nums = new int[]{0};
        assertTrue(testClass.canJump(nums));

        nums = new int[]{1};
        assertTrue(testClass.canJump(nums));
    }

    @Test
    void canJumpBasicCases() {
        int[] nums = new int[]{2,3,1,1,4};
        assertTrue(testClass.canJump(nums));

        nums = new int[]{3,2,1,0,4};
        assertFalse(testClass.canJump(nums));
    }

    @Test
    void insidiousCases() {
        int[] nums = new int[]{2,0};
        assertTrue(testClass.canJump(nums));
    }
}