import java.util.HashSet;

public class P3 {
    public int lengthOfLongestSubstring(String s) {
        int lo = 0, hi = -1,n = s.length();
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0;i < n;i++){
            if (i != 0) set.remove(s.charAt(i - 1));
            while (hi + 1 < n && !set.contains(s.charAt(hi + 1))){
                hi++;
                set.add(s.charAt(hi));
            }
            ans = Math.max(ans, hi - i + 1);
        }
        return ans;
    }
}
