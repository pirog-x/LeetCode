package array_problems;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

/**
 *  big O = O(n)
 *  extra memory = O(1)
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        int lenOfUniqueValues = 1;

        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
                lenOfUniqueValues++;
            }
            right++;
        }
        return lenOfUniqueValues;
    }
}
