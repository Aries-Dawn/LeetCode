public class P2016 {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        long ans = -1;
        int n = nums.length;
        if (n<2) return (int)ans;
        for (int i = 1;i < n;i++){
            if (nums[i]>min) ans=Math.max(ans,(long) nums[i]-min);
            else min=nums[i];
        }
        return (int)ans;
    }
}
