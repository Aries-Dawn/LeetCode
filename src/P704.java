public class P704 {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int med = (lo + hi)/2;
        while (nums[med] != target){
            if (lo > hi) return -1;
            if (lo == hi && nums[lo] == target) return lo;
            if (lo == hi && nums[lo] != target) return -1;
            if (nums[med] < target) {
                lo = med + 1;
                med = (med + hi) / 2;
            }
            if (nums[med] > target){
                hi = med - 1;
                med = (lo + med) / 2;
            }
        }
        return med;
    }
    public int search_new (int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi){
            int med = (hi + lo) / 2;
            if (nums[med] == target) return med;
            else if (nums[med] < target) lo = med + 1;
            else hi = med - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        P704 p = new P704();
//        int[] num = new int[]{-1,0,3,5,9,12};
//        int tar = 2;

        int[] num = new int[]{-1,0,3,5,9,12};
        int tar = 1;
        System.out.println(p.search_new(num,tar));
    }
}
