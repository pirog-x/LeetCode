package task.java.leetcode75.lvl2;

public class WhereWillTheBallFall {

    private int tmp = 0;

    public int[] findBall(int[][] grid) {
        int[] path = new int[grid[0].length];

        for (int i = 0; i < grid[0].length; i++) {
            if (roll(grid, 0, i))
                path[i] = tmp;
            else
                path[i] = -1;
        }
        return path;
    }

    private boolean roll(int[][] grid, int n, int m) {
        if (n == grid.length) {
            tmp = m;
            return true;
        }

        if (m == 0 && grid[n][m] == -1) return false;
        if (m == grid[0].length - 1 && grid[n][m] == 1) return false;



        if (grid[n][m] == 1) {
            if (grid[n][m + 1] == -1) return false;
            return roll(grid, n + 1, m + 1);

        } else {
            if (grid[n][m - 1] == 1) return false;
            return roll(grid, n + 1, m - 1);
        }
    }
}
