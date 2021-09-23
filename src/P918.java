import java.util.Arrays;

public class P918 {
    /**
     * @param nums:  an array of n integers
     * @param target: a target
     * @return: the number of index triplets satisfy the condition nums[i] + nums[j] + nums[k] < target
     */
    public int threeSumSmaller(int[] nums, int target) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0;i < nums.length;i++){
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi){
                if (nums[lo] + nums[hi] +nums[i]< target){
                    count += hi - lo;
                    lo++;
                }else
                    hi--;
            }
        }
        return count;
    }
}