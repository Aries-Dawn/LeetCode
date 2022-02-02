import java.util.Arrays;
import java.util.HashMap;

public class P167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        int sum;
        while (l < r){
            sum = numbers[l] + numbers[r];
            if (sum < target) l++;
            else if (sum == target) return new int[]{l + 1, r + 1};
            else r--;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] numbers = new int[]{-1,0};
        P167 p167 = new P167();
        System.out.println(Arrays.toString(p167.twoSum(numbers, -1)));
    }
}