public class P12 {
    public String intToRoman(int num) {
        String[] t = {"","M","MM","MMM"};
        String[] h = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] o = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return t[num/1000]+h[num%1000/100]+tens[num%100/10]+o[num%10];
    }
}
