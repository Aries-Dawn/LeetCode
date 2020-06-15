import java.util.Scanner;

public class P831 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        if (in.contains("@")) {
            String[] newOne = in.split("@");
            if (newOne[0].length() >= 2 && newOne[0].matches(".*[a-zA-Z]+.*")) {
                String temp = newOne[0].toLowerCase();
                sb.append(temp.charAt(0))
                        .append("*****")
                        .append(temp.charAt(temp.length() - 1)).append("@");
                String[] next = newOne[1].split("\\.");
                sb.append(next[0].toLowerCase()).append(".").append(next[1].toLowerCase());
            }
        } else {
            String temp = in.replaceAll("[+\\-() ]","");
            int len = temp.length();
            if (len > 10){
                sb.append("+");
                sb.append("*".repeat(len - 10));
                sb.append("-");
            }
            sb.append("***-***-").append(temp.substring(temp.length()-4));
        }
        System.out.println(sb.toString());
    }
}
