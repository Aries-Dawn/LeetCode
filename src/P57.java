import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P57 {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            int lo = i + 1;
            int hi = numbers.length - 1;
            while (lo < hi) {
                if (numbers[lo] + numbers[hi] == -numbers[i]){
                    List<Integer> temp =new ArrayList<>();
                    temp.add(numbers[i]);
                    temp.add(numbers[lo]);
                    temp.add(numbers[hi]);
                    if (!result.contains(temp))
                        result.add(temp);
                    lo++;
                }
                else if (numbers[lo] + numbers[hi] > -numbers[i]){
                    hi--;
                }
                else if (numbers[lo] + numbers[hi] < -numbers[i]){
                    lo++;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = new int[]{1,0,-1,-1,-1,-1,0,1,1,1};
        P57 p = new P57();
        var s = p.threeSum(a);
        System.out.println(s);
    }
}