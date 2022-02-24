public class P5 {
    public String longestPalindrome(String s) {
        int max = 0,len = s.length(),temp,lo=0,hi=0;
        char[] list = s.toCharArray();
        for (int i = 0; i < len;i++){
            int l = i,r=i;
            while (l>=0 && r< len&& list[l]==list[r]){
                --l;
                ++r;
            }
            temp = r-l+1;
            if (max < temp){
                lo = l+1;
                hi = r-1;
                max = temp;
            }
            l = i;
            r=i+1;
            while (l>=0 && r< len&& list[l]==list[r]){
                --l;
                ++r;
            }
            temp = r-l+1;
            if (max < temp){
                lo = l+1;
                hi = r-1;
                max = temp;
            }
        }
        return s.substring(lo,hi+1);
    }
}