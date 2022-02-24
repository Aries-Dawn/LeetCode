public class P8 {
    public int myAtoi(String s) {
        int flag = 1;
        boolean jump = true,signal=true;
        long count=0;
        int num;
        char[] c = s.toCharArray();
        for (char temp : c){
            if (!(temp==' '&&jump)) {
                jump=false;
                num=temp-'0';
                if (num<10 && num>=0){
                    signal=false;
                    count *= 10;
                    count += num;
                    if (flag<0 && flag*count<Integer.MIN_VALUE) return Integer.MIN_VALUE;
                    else if (flag>0 && count>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                }
                else if (signal&&(temp=='-'||temp=='+')){
                    if (temp=='-') flag=-1;
                    signal=false;
                }
                else {
                    return (int)(flag*count);
                }
            }
        }
        return (int)(flag*count);
    }
}