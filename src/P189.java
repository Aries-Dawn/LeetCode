public class P189 {
    public void rotate(int[] nums, int k) {
        int[] temp = nums.clone();
        int len = nums.length;
        for(int i = 0; i < len;i++) temp[(i+k)%len] = nums[i];
        System.arraycopy(temp,0,nums,0,len);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-100,3,99};
        int k = 2;
        P189 p189 = new P189();
        p189.rotate(nums,k);
    }
}
