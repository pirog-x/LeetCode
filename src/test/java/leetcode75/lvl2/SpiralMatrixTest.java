package leetcode75.lvl2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class SpiralMatrixTest {

    SpiralMatrix testClass = new SpiralMatrix();

    @Test
    void spiralOrderThreeByThree() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        Assertions.assertEquals(expected, testClass.spiralOrder(matrix));
    }
}