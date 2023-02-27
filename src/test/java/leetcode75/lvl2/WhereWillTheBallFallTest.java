package leetcode75.lvl2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task.java.leetcode75.lvl2.WhereWillTheBallFall;

class WhereWillTheBallFallTest {

    WhereWillTheBallFall testClass = new WhereWillTheBallFall();

    @Test
    void findBallTest() {
        // case 1
        int[][] field = new int[][]{
                {1, 1, 1, -1, -1},
                {1, 1, 1, -1, -1},
                {-1, -1, -1, 1, 1},
                {1, 1, 1, 1, -1},
                {-1, -1, -1, -1, -1}
        };

        int[] expected = new int[]{1, -1, -1, -1, -1};
        Assertions.assertArrayEquals(expected, testClass.findBall(field));


        // case 2
        field = new int[][] {
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1},
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1}
        };

        expected = new int[] {0, 1, 2, 3, 4, -1};
        Assertions.assertArrayEquals(expected, testClass.findBall(field));
    }
}
