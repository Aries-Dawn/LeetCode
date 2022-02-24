import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P76 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        HashMap<Character,Integer> map = new HashMap<>();
        int n = t.length();
        if (n == 0) return "";
        int m = s.length();
        int need = n;
        int MAX = Integer.MAX_VALUE, ansL = -1,ansR = -1;
        int lo = 0, hi = -1;
        for (int i = 0;i < n;i++){
            char c = t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char temp;
        int num;
        while (hi<m){
            ++hi;
            if (hi<m && map.containsKey(s.charAt(hi))) {
                temp = s.charAt(hi);
                num = map.getOrDefault(temp,0);
                map.put(s.charAt(hi), num-1);
                if (num-1>=0) need-=1;
            }
            while (hi<m && need<=0 && lo<=hi){
                if (hi-lo+1 < MAX){
                    MAX = hi-lo+1;
                    ansL = lo;
                    ansR = lo+MAX;
                }
                if (map.containsKey(s.charAt(lo))){
                    temp = s.charAt(lo);
                    num = map.getOrDefault(temp,0);
                    map.put(temp,num+1);
                    if (num+1>0) need+=1;
                }
                ++lo;
            }
        }
        return ansL==-1?"":s.substring(ansL,ansR);
    }

    public static void main(String[] args) {
        P76 p76 = new P76();

        System.out.println(p76.minWindow("afsdfsdfdsfsdfbA", ""));
    }
}