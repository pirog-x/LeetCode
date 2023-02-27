package top_interview_questions.easy;

import org.junit.jupiter.api.Test;
import task.java.top_interview_questions.easy.ClimbingStairs;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private final ClimbingStairs testClass = new ClimbingStairs();

    @Test
    void climbStairs() {
        int stairs = 2;
        int expected = 2;
        assertEquals(expected, testClass.climbStairs(stairs));

        stairs = 4;
        expected = 5;
        assertEquals(expected, testClass.climbStairs(stairs));
    }
}