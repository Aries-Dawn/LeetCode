import java.util.Arrays;
import java.util.HashSet;

public class P567 {
    public boolean checkInclusion(String s1, String s2) {
        int size = s1.length();
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0;i < size;i++){
            char temp = s1.charAt(i);
            int index = temp - 'a';
            cnt1[index] += 1;
        }
        int n = s2.length();
        for (int i =0;i + size - 1 < n;i++){
            if (i == 0){
                for (int j = 0;j < size ;j ++){
                    cnt2[s2.charAt(j)-'a'] += 1;
                }
            }
            else {
                cnt2[s2.charAt(i-1) - 'a'] -= 1;
                cnt2[s2.charAt(i + size - 1) - 'a'] += 1;
            }
            if (Arrays.equals(cnt1,cnt2)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        P567 p567 = new P567();
        System.out.println(p567.checkInclusion("a", "ab"));
    }
}
