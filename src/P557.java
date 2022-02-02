public class P557 {
    public String reverseWords(String s) {
        String[] list = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int lo , hi;
        char[] strings;
        int count = 0;
        for (String temp : list){
            lo = 0;
            if (count!=0) sb.append(" ");
            hi = temp.length() -1;
            strings = new char[hi + 1];
            while (lo <= hi){
                strings[lo] = temp.charAt(hi);
                strings[hi] = temp.charAt(lo);
                hi--;
                lo++;
            }
            sb.append(strings);
            count++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "God";
        P557 p557 = new P557();
        System.out.println(p557.reverseWords(s));
    }
}
