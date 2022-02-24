import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp;
        int lo,hi,t;

        int sum,len=nums.length;
        for (int i = 0; i < len-2; i++) {
            lo = i+1;
            hi = len - 1;
            t=-nums[i];
            while (lo < hi) {
                while (lo > 0 && nums[lo]==nums[lo-1]) ++lo;
                ++lo;
                while (hi < len-2 && nums[hi]==nums[hi+1]) --hi;
                --hi;
                sum = nums[lo] + nums[hi];
                if (sum == t) {
                    temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[lo]);
                    temp.add(nums[hi]);
                    ans.add(temp);
//                    while (hi > lo) {
//                        if (hi - 1 > 0 && nums[hi - 1] == nums[hi]) --hi;
//                        else {
//                            --hi;
//                            break;
//                        }
//                    }
//                    while (hi > lo) {
//                        if (lo+1 < len && nums[lo + 1] == nums[lo]) ++lo;
//                        else {
//                            ++lo;
//                            break;
//                        }
//                    }
                } else if (sum > t) {
                    while (hi - 1 > 0 && nums[hi - 1] == nums[hi]) --hi;
                    --hi;
                } else {
                    while (lo+1 < len && nums[lo + 1] == nums[lo]) ++lo;
                    ++lo;
                }
            }
            while (i+1 <len&& nums[i+1]==nums[i]) ++i;
        }
        return ans;
    }

    public static void main(String[] args) {
        P15 p15=new P15();
        int[] i = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> t = p15.threeSum(i);
        System.out.println(t);
    }
}
