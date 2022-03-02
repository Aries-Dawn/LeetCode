import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class P18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (len < 4) return ans;
        int c, d;
        int num_a, num_b, t;
        long sum;
        for (int a = 0; a < len - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue;
            if ((long) nums[a] + nums[a + 1] + nums[a + 2] + nums[a + 3] > target) break;
            if ((long) nums[a] + nums[len - 3] + nums[len - 2] + nums[len - 1] < target) continue;
            num_a = nums[a];
            t = target - num_a;
            for (int b = a + 1; b < len - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) continue;
                if ((long) nums[b] + nums[b + 1] + nums[b + 2] > t) break;
                if ((long) nums[b] + nums[len - 2] + nums[len - 1] < t) continue;
                num_b = nums[b];
                c = b + 1;
                d = len - 1;
                while (c < d) {
                    sum = (long) num_b + nums[c] + nums[d];
                    if (sum == t) {
                        ans.add(Arrays.asList(num_a, num_b, nums[c], nums[d]));
                        while (c < d && nums[c] == nums[c + 1]) ++c;
                        ++c;
                        while (d > c && nums[d] == nums[d - 1]) --d;
                        --d;
                    } else if (sum < t) {
                        ++c;
                    } else {
                        --d;
                    }
                }
                while (b < len - 2 && nums[b] == nums[b + 1]) ++b;
            }
            while (a < len - 3 && nums[a] == nums[a + 1]) ++a;
        }
        return ans;
    }

    public static void main(String[] args) {
        P18 p18 = new P18();
        int[] num = {0, 0, 0, 1000000000, 1000000000, 1000000000, 1000000000};
        System.out.println(p18.fourSum(num, 1000000000));
    }
}
