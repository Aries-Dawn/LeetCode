import java.util.ArrayList;
import java.util.List;

public class P1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int point = 0;
        for (int i = 1;i <= n;i++){
            if (point < target.length && target[point]!=i){
                ans.add("Push");
                ans.add("Pop");
            }
            else if (point < target.length ){
                ans.add("Push");
                point++;
            }
            else break;
        }
        return ans;
    }
}
