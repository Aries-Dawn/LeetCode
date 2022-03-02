import java.util.HashMap;
import java.util.HashSet;

public class P6009 {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> hash_s = new HashMap<>();
        HashMap<Character,Integer> hash_t = new HashMap<>();
        int n = s.length();
        int m = t.length();
        int s_need=m,n_need=n;
        for (int i = 0;i < n;i++){
            char temp = s.charAt(i);
            if (hash_s.containsKey(temp)) hash_s.put(temp,hash_s.getOrDefault(temp,1)+1);
            else hash_s.put(temp,1);
        }
        for (int i = 0;i < m;i++){
            char temp = t.charAt(i);
            if (hash_t.containsKey(temp)) hash_t.put(temp,hash_t.getOrDefault(temp,1)+1);
            else hash_t.put(temp,1);
            if (hash_s.containsKey(temp)){
                if (hash_s.get(temp)>0){
                    --s_need;
                    --n_need;
                    hash_s.put(temp,hash_s.getOrDefault(temp,1)-1);
                    hash_t.put(temp,hash_t.getOrDefault(temp,1)-1);
                }
            }
        }
        return s_need+n_need;
    }
}
