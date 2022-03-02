public class P6008 {

    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int count=0;
        char[] letter = pref.toCharArray();
        for (String word :words){
            for (int i = 0;i < n;i++){
                if (word.length()<n||word.charAt(i)!=letter[i]) break;
                if (i==n-1) ++count;
            }
        }
        return count;
    }
}
