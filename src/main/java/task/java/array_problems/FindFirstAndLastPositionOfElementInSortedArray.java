package task.java.array_problems;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

/**
 * O(log n)
 */

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int right = binarySearch(nums, target, false);
        int left = binarySearch(nums, target, true);
        return new int[]{left, right};
    }

    public int binarySearch(int[] nums, int target, boolean leftBias) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        int i = -1;
        while (left <= right) {
            mid = (left + right) >> 1;
            if (nums[mid] > target) {
                right = --mid;
            } else if (nums[mid] < target) {
                left = ++mid;
            } else {
                i = mid;
                if (leftBias) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return i;
    }
}