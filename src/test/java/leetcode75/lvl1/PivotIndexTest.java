package leetcode75.lvl1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PivotIndexTest {
    @Test
    void testPivotIndex() {
        int[] testArray = new int[] {1,7,3,6,5,6};
        PivotIndex pi = new PivotIndex();
        assertEquals(3, pi.pivotIndex(testArray));

        testArray = new int[] {3, 5, 1, 3};
        assertEquals(-1, pi.pivotIndex(testArray));

        testArray = new int[] {2, -1, 1};
        assertEquals(0, pi.pivotIndex(testArray));
    }
}