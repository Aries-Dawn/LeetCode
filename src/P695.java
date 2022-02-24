import java.util.LinkedList;
import java.util.Queue;

public class P695 {
    int[] dx = new int[]{1,0,0,-1};
    int[] dy = new int[]{0,1,-1,0};
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int max = 0;
        for (int i = 0;i < n;i++){
            for (int j = 0 ;j < m;j++){
                if (grid[i][j] == 1) max = Math.max(max,countIsland(grid,i,j,n,m));
            }
        }
        return max;
    }
    public int countIsland(int[][] grid,int x,int y,int n,int m){
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        queue.add(new int[]{x,y});
        grid[x][y] = 0;
        ++count;
        while (!queue.isEmpty()){
            int[] temp = queue.poll();
            int _x = temp[0],_y = temp[1];
            for (int i = 0; i < 4; i++) {
                int mx = _x + dx[i], my = _y + dy[i];
                if (mx >= 0 && mx < n && my >= 0 && my < m && grid[mx][my] == 1) {
                    queue.add(new int[]{mx, my});
                    grid[mx][my] = 0;
                    ++count;
                }
            }
        }
        return count;
    }
}
