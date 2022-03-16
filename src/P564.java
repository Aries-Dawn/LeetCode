import java.util.ArrayList;

public class P564 {
    public String nearestPalindromic(String n) {
        long self = Long.parseLong(n);
        long ans = -1;
        ArrayList<Long> candidates = new ArrayList<>();
        int len = n.length();
        candidates.add((long) Math.pow(10, len - 1) - 1);
        candidates.add((long) Math.pow(10, len) + 1);
        long selfPrefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        for (long i = selfPrefix - 1; i <= selfPrefix + 1; i++) {
            StringBuilder sb = new StringBuilder();
            String s = String.valueOf(i);
            sb.append(s);
            StringBuffer stringBuffer = new StringBuffer(s).reverse();
            sb.append(stringBuffer.substring(len & 1));
            String temp = sb.toString();
            candidates.add(Long.parseLong(temp));
        }
        for (long can : candidates) {
            if (can != self) {
                if (ans == -1 ||
                        Math.abs(can - self) < Math.abs(ans - self) ||
                        Math.abs(can - self) == Math.abs(ans - self) && can < ans) {
                    ans = can;
                }
            }
        }
        return String.valueOf(ans);
    }
}
