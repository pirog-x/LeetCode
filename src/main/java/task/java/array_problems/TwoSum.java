package task.java.array_problems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum
// n = nums.length
// time: O(n)
// space: O(n)
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 1) { return new int[]{0}; }
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int needToResult = target - nums[i];
            if (map.containsKey(needToResult)) {
                return new int[] {map.get(needToResult), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
