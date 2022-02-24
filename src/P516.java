import java.util.HashMap;
import java.util.HashSet;

public class P516 {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        char[] ch = s.toCharArray();
        char t1,t2;
        for (int i = n-1;i >=0;i--){
            dp[i][i]=1;
            t1 = ch[i];
            for (int j = i+1;j < n;j++){
                t2 = ch[j];
                if (t1==t2) dp[i][j] = dp[i+1][j-1]+2;
                else dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
            }
        }
        return dp[0][n-1];
    }
}
