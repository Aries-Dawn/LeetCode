public class P11 {
    public int maxArea(int[] height) {
        int L=0,R=height.length-1;
        int max = 0,temp;
        while (L<R){
            int min = Math.min(height[L],height[R]);
            temp=(R-L)*min;
            if (temp>max) max=temp;
            while (height[L]<=min&&L<R) ++L;
            while (height[R]<=min&&L<R) --R;
        }
        return max;
    }
}