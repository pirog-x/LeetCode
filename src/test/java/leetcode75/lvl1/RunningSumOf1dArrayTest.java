package leetcode75.lvl1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOf1dArrayTest {

    @Test
    void runningSum() {
        RunningSumOf1dArray task = new RunningSumOf1dArray();

        int[] expected = new int[] {0,0,0,0,0,0};
        int[] actual = new int[] {0,0,0,0,0,0};
        Assertions.assertArrayEquals(expected, task.runningSum(actual));

        expected = new int[] {1, 5, 10, 13};
        actual = new int[] {1, 4, 5, 3};
        Assertions.assertArrayEquals(expected, task.runningSum(actual));

        expected = new int[] {1, 3, 6, 10};
        actual = new int[] {1, 2, 3, 4};
        Assertions.assertArrayEquals(expected, task.runningSum(actual));

        expected = new int[] {1, 3, 6, 10};
        actual = new int[] {1, 2, 3, 4};
        Assertions.assertArrayEquals(expected, task.runningSum(actual));
    }
}