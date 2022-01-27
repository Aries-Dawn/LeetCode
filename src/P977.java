public class P977 {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int lo = 0;
        int hi = len - 1;
        len--;
        while (lo <= hi) {
            int lo_2 = nums[lo] * nums[lo];
            int hi_2 = nums[hi] * nums[hi];
            if (lo_2 >= hi_2) {
                result[len--] = lo_2;
                lo++;
            } else {
                result[len--] = hi_2;
                hi--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P977 p977 = new P977();
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] res = p977.sortedSquares(nums);
        for (int temp :
                res) {
            System.out.printf("%d ", temp);
        }
        System.out.println();
    }
}
