import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P17 {
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits==null||digits.length() == 0) return ans;
        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
        backTrack(ans,new StringBuffer(),digits,phoneMap,0,digits.length());
        return ans;
    }

    public static void backTrack(List<String> ans,StringBuffer combined, String next,Map<Character, String> phoneMap,int index,int size){
        if (index == size) ans.add(combined.toString());
        else {
            String s = phoneMap.get(next.charAt(index));
            for (int i =0 ;i <s.length();i++){
                combined.append(s.charAt(i));
                backTrack(ans,combined,next,phoneMap,index+1,size);
                combined.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
