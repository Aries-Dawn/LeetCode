import java.util.HashSet;

public class P567 {
    public boolean checkInclusion(String s1, String s2) {
        int size = s1.length();
        int n = s2.length();
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i + size - 1 < n; i++) {
            set.clear();
            for (int j = 0; j < size; j++)
                set.add(s2.charAt(i + j));
            for (int j = 0; j < size; j++) {
                if (set.contains(s1.charAt(j))) count += 1;
                else break;
                if (count == size) return true;
            }
            count = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        P567 p567 = new P567();
        System.out.println(p567.checkInclusion("adc", "dcda"));
    }
}
