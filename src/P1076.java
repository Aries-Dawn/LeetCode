public class P1076 {
    public int[] findBall_for(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int location, direction;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            location = i;
            for (int[] rows : grid) {
                direction = rows[location];
                location += direction;
                if (location < 0 || location == n || rows[location] != direction) {
                    location = -1;
                    break;
                }
            }
            ans[i] = location;
        }
        return ans;
    }

    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = out(grid, m, n, i, 0);
        }
        return ans;
    }

    public int out(int[][] grid, int row, int col, int x, int y) {
        if (y == row) return x;
        if (x == 0 && grid[y][x] == -1) return -1;
        if (x == col - 1 && grid[y][x] == 1) return -1;
        if (grid[y][x] == 1 && grid[y][x + 1] == -1) return -1;
        if (grid[y][x] == -1 && grid[y][x - 1] == 1) return -1;
        return out(grid, row, col, x + grid[y][x], y + 1);
    }
}
