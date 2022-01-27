public class P35 {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int med = lo + (hi - lo) / 2;
            if (nums[med] == target) return med;
            else if (nums[med] < target) lo = med + 1;
            else hi = med - 1;
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        P35 p35 = new P35();
        System.out.println(p35.searchInsert(nums,target));
    }
}
