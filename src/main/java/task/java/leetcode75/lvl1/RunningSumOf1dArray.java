package task.java.leetcode75.lvl1;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j <= i; j++) {
                result[i] += nums[j];
            }
        }
        return result;
    }
}
