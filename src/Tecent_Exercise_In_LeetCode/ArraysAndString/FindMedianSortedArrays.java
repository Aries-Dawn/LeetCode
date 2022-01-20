package Tecent_Exercise_In_LeetCode.ArraysAndString;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2, 4};
        FindMedianSortedArrays f = new FindMedianSortedArrays();
        System.out.println(f.findMedianSortedArrays(a,b));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0;
        int len_1 = nums1.length;
        int len_2 = nums2.length;
        int sum = len_1 + len_2;
        int median = sum / 2;
        boolean only = sum % 2 != 0;
        if (only) median+=1;
        int count = 1,first = 0,second= 0;
        for (int i = 0;i < sum; i++){
            int temp;
            if (second >= len_2 || (first<len_1 && nums1[first] <= nums2[second])) {
                temp = nums1[first];
                first++;
            }
            else {
                temp = nums2[second];
                second++;
            }
            if (count == median) {
                res += temp;
                if (only) return res;
            }
            if (!only && count == median+1) {
                res += temp;
                res /= 2.0;
                return res;
            }
            count++;
        }
        return res;
    }
}
