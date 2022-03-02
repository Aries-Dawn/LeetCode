public class P537 {
    public String complexNumberMultiply(String num1, String num2) {
        int num1_real,num1_virtual,num2_real,num2_virtual;
        String[] complex1 = num1.split("[+i]");
        num1_real=Integer.parseInt(complex1[0]);
        num1_virtual=Integer.parseInt(complex1[1]);
        num2_real=Integer.parseInt(complex1[2]);
        num2_virtual=Integer.parseInt(complex1[3]);
        return ""+(num1_real*num2_real-num1_virtual*num2_virtual)+"+"+(num1_real*num2_virtual+num2_real*num1_virtual)+"i";
    }
}
