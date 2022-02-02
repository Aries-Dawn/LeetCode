import java.util.Arrays;
import java.util.HashMap;

public class P344 {
    public void reverseString(char[] s) {
        int lo = 0, hi = s.length - 1;
        char temp;
        while (lo < hi) {
            temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'H','e','l','l','o'};
        P344 p344 = new P344();
        p344.reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
