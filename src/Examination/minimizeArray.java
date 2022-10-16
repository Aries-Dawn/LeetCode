package Examination;

import java.util.*;

public class minimizeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i < n;i++) nums[i]=sc.nextInt();
        boolean allOdd = true, allEven = true;
        for (int i : nums) {
            if (i % 2 == 0)
                allOdd = false;
            else
                allEven = false;
        }
        if (allOdd || allEven) {
            for (int i =0;i < n-1;i++) System.out.print(nums[i]+" ");
            System.out.println(nums[n-1]);
        }
        else {
            Arrays.sort(nums);
            for (int i =0;i < n-1;i++) System.out.print(nums[i]+" ");
            System.out.println(nums[n-1]);
        }
    }
}
