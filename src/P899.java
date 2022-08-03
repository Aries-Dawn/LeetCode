import java.util.Arrays;

class P899 {
    public String orderlyQueue(String s, int k) {
        if (k==1){
            String smallest = s;
            StringBuilder sb = new StringBuilder(s);
            int len = s.length();
            for (int i = 0;i < len;i++){
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);
                if (sb.toString().compareTo(smallest)<0) smallest = sb.toString();
            }
            return smallest;
        }
        else {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }

    public static void main(String[] args) {
        P899 p899 = new P899();
        System.out.println(p899.orderlyQueue("cba",2));
    }
}