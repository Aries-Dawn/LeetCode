package Tecent_Exercise_In_LeetCode.ArraysAndString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] num = new int[]{3,2,4};
        int target = 6;
        int[] res = t.twoSum(num, target);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            if (map.get(target-nums[i]) != null) return new int[]{map.get(target-nums[i]),i};
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
