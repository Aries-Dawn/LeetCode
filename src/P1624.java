import java.util.Arrays;

public class P1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] index = new int[26];
        int maxL=-1;
        Arrays.fill(index,-1);
        for (int i = 0;i < s.length();i++){
            if (index[s.charAt(i)-'a']<0) index[s.charAt(i)-'a']=i;
            else maxL = Math.max(maxL,i-index[s.charAt(i)-'a']-1);
        }
        return maxL;
    }
}
