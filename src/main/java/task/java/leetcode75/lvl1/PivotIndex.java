package task.java.leetcode75.lvl1;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int prevSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) prevSum += nums[i - 1];
            if (totalSum - (nums[i] + prevSum) == prevSum)
                return i;
        }
        return -1;
    }
}
