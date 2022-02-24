public class P6 {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int index;
        for(int i = 0;i < numRows;i++){
            index = i;
            if(i==0)
                while(index < s.length()){
                    sb.append(s.charAt(index));
                    index += ((numRows - 1)<<1);
                }
            else
                while(index < s.length()){
                    sb.append(s.charAt(index));
                    index += ((numRows-1-i)<<2);
                    sb.append(s.charAt(index));
                    index += (i<<2);
                }
        }
        return sb.toString();
    }
}
