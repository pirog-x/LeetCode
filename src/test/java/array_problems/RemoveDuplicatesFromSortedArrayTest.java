package array_problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeEach
    void init() {
        this.removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    void removeDuplicates() {
        int[] initialArr = new int[] {1,1,2};
        int[] expectedArr = new int[] {1,2,0};
        int expectedLength = 2;
        
        assertEquals(expectedLength, removeDuplicatesFromSortedArray.removeDuplicates(initialArr));
        for (int i = 0; i < expectedLength; i++) {
            assert initialArr[i] == expectedArr[i] : "Wrong number in array, expected: " + expectedArr[i] +
                    ", receive: " + initialArr[i] + ", index: " + i;
        }

        initialArr = new int[]{0,0,1,1,1,2,2,3,3,4};
        expectedArr = new int[] {0,1,2,3,4,0};
        expectedLength = 5;

        assertEquals(expectedLength, removeDuplicatesFromSortedArray.removeDuplicates(initialArr));
        for (int i = 0; i < expectedLength; i++) {
            assert initialArr[i] == expectedArr[i] : "Wrong number in array, expected: " + expectedArr[i] +
                    ", receive: " + initialArr[i] + ", index: " + i;
        }
    }
}