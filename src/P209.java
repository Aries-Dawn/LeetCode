public class P209 {
    public int minSubArrayLen(int target, int[] nums) {
        int L =0,R=0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while (R < nums.length){
            sum+=nums[R];
            while(sum>=target){
                min=Math.min(min,R-L+1);
                sum-=nums[L];
                ++L;
            }
            ++R;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
