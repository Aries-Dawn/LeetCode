import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P733 {
    int[] dx = new int[]{1, 0, 0, -1};
    int[] dy = new int[]{0, 1, -1, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int current = image[sr][sc];
        if (current == newColor) return image;
        int n = image.length;
        int m = image[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        image[sr][sc] = newColor;
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < n && my >= 0 && my < m && image[mx][my] == current) {
                    queue.add(new int[]{mx, my});
                    image[mx][my] = newColor;
                }
            }
        }
        return image;
    }

    public static void main(String[] args) {
        P733 p733 = new P733();
        int[][] image = new int[3][];
        image[0] = new int[]{1, 1, 1};
        image[1] = new int[]{1, 1, 0};
        image[2] = new int[]{1, 0, 1};
        image = p733.floodFill(image, 1, 1, 2);
        for (int[] ints : image) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
