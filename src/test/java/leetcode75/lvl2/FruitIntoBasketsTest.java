package leetcode75.lvl2;

import org.junit.jupiter.api.Test;
import task.java.medium.FruitIntoBaskets;

import static org.junit.jupiter.api.Assertions.*;

class FruitIntoBasketsTest {

    FruitIntoBaskets testClass = new FruitIntoBaskets();

    @Test
    void totalFruit() {
        int[] fruits = new int[]{3,3,3,1,2,1,1,2,3,3,4};
        int expected = 5;

        assertEquals(expected, testClass.totalFruit(fruits));
    }
}