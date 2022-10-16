package Examination;

import java.util.*;

public class divisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String string = sc.next();
        int[] S = new int[n];
        for (int i = 0;i < n;i++) S[i]=string.charAt(i)-'0';
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0;i < n;i++){
            getAllNumber(S[i], i+1, k, S, n, set);
        }
        System.out.println(set.size()%100007);
    }

    public static void getAllNumber(int pre, int index, int k, int[] s, int n, HashSet<Integer> set){
        if (index == n) return;
        getAllNumber(pre, index + 1, k, s, n, set);
        getAllNumber(pre * 10 + s[index], index + 1, k, s, n, set);
        if (pre%k==0) set.add(pre);
    }
}
