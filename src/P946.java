import java.util.LinkedList;
import java.util.Stack;

public class P946 {
    public boolean validateStackSequences_slow(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int n = popped.length, m = pushed.length;
        for (int i = 0; i < n; ) {
            if (stack.peek() == popped[i]) {
                stack.pop();
                i++;
            } else if (count < m) stack.push(pushed[count++]);
            else break;
        }
        return stack.isEmpty();
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int n = popped.length, m = pushed.length;
        for (int j : pushed) {
            stack.push(j);
            while (!stack.isEmpty() && count < n && stack.peek() == popped[count]) {
                stack.pop();
                count++;
            }
        }
        return count == n;
    }

    public boolean validateStackSequences_the_most(int[] pushed, int[] popped) {
        int push = 0, pop = 0;
        for (int i : pushed) {
            pushed[push] = i;
            while (push >= 0 && pushed[push] == popped[pop]) {
                push--;
                pop++;
            }
            push++;
        }
        return push == 0;
    }

}