import java.util.Arrays;

public class P16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = 100000000;
        int n = nums.length;
        int sum,diff=100000000;
        for (int i = 0;i < n-2;++i){
            if (i>0 && nums[i]==nums[i-1]) continue;
            int min = nums[i]+nums[i+1]+nums[i+2];
            if (min > target){
                if (min-target<diff) {
                    best = min;
                }
                break;
            }
            int max = nums[i]+nums[n-2]+nums[n-1];
            if (max<target){
                if (target-max<diff) {
                    best = max;
                    diff = target-max;
                }
                continue;
            }
            int j = i+1,k=n-1;
            while (j<k){
                sum = nums[i]+nums[j]+nums[k];
                if (sum==target) return sum;
                if (sum>target){
                    while (j<k&&nums[k-1]==nums[k]) --k;
                    --k;
                    if (sum-target<diff){
                        best=sum;
                        diff=sum-target;
                    }
                }
                if (sum<target){
                    while (j<k&&nums[j+1]==nums[j]) ++j;
                    ++j;
                    if (target-sum<diff){
                        best=sum;
                        diff=target-sum;
                    }
                }
            }
        }
        return best;
    }
}
