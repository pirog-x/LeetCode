package array_problems;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int jumps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && jumps == 0) return false;
            jumps = Math.max(jumps, nums[i]);
            jumps--;
        }
        return true;
    }
}
