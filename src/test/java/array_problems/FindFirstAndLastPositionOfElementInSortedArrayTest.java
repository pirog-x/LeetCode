package array_problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    void searchRange() {
        FindFirstAndLastPositionOfElementInSortedArray testClass = new FindFirstAndLastPositionOfElementInSortedArray();


        // case 1
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] expectedResult = new int[]{3,4};
        assertArrayEquals(expectedResult, testClass.searchRange(nums, target));

        // case 2
        nums = new int[] {5,7,7,8,8,10};
        target = 6;
        expectedResult = new int[] {-1, -1};
        assertArrayEquals(expectedResult, testClass.searchRange(nums, target));

        // case 3
        nums = new int[0];
        target = 0;
        assertArrayEquals(expectedResult, testClass.searchRange(nums, target));

        // case 4
        nums = new int[] {1};
        target = 1;
        expectedResult = new int[]{0, 0};
        assertArrayEquals(expectedResult, testClass.searchRange(nums, target));
    }
}