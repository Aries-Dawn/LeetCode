public class P283 {
    public void moveZeroes(int[] nums) {
        int a = 0, b = 0;
        while (a < nums.length) {
            if (nums[a] != 0) {
                swap(nums, a, b);
                b++;
            }
            a++;
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        P283 p283 = new P283();
        int[] nums = new int[]{0,1,0,3,12};
        p283.moveZeroes(nums);
        for (int i : nums)
            System.out.printf("%d ",i);
    }
}
