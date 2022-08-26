import java.util.Arrays;

class P1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        return (nums[size-2]-1) * (nums[size-1]-1);
    }
}