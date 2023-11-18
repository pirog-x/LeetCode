package task.java.array_problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {
    @Test
    public void testTwoSumCase1() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = twoSum.twoSum(nums, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testTwoSumCase2() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] actual = twoSum.twoSum(nums, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testTwoSumCase3() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] actual = twoSum.twoSum(nums, target);
        assertThat(actual).isEqualTo(expected);
    }
}