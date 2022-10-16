import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

class P636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Node> function = new Stack<Node>();
        int[] time = new int[n];
        String[] first = logs.get(0).split(":");
//        System.out.println(Arrays.toString(first));
        Node begin = new Node(
                Integer.parseInt(first[0]),
                first[1].equals("start")?1:0,
                Integer.parseInt(first[2]));
        function.push(begin);
        String[] temp;
        Node peek;
        int currentTimestamp = 0;
        for (int i = 1;i < logs.size();i++){
            temp = logs.get(i).split(":");
            Node tempNode = new Node(
                    Integer.parseInt(temp[0]),
                    temp[1].equals("start")?1:0,
                    Integer.parseInt(temp[2]));
            currentTimestamp = tempNode.timestamp;
            if (tempNode.type == 1){
                if (!function.isEmpty()){
                    peek = function.peek();
                    int num = peek.id;
                    time[num] += currentTimestamp - peek.timestamp;
                    peek.timestamp = currentTimestamp;
                }
                function.push(tempNode);
            }
            else {
                peek = function.pop();
                int num = peek.id;
                time[num] += currentTimestamp - peek.timestamp + 1;
                if (!function.isEmpty()){
                    function.peek().timestamp = currentTimestamp+1;
                }
            }
        }
        return time;
    }

    class Node{
        int id;
        int type; // 0 is end, 1 is start;
        int timestamp;
        int time = 0;

        public Node(int id,int type, int timestamp){
            this.id = id;
            this.type = type;
            this.timestamp = timestamp;
        }
    }

    public static void main(String[] args) {
        P636 p636 = new P636();
        String[] input = {"0:start:0","1:start:2","1:end:5","0:end:6"};
        List<String> in = Arrays.stream(input).collect(Collectors.toList());
        System.out.println(Arrays.toString(p636.exclusiveTime(3, in)));
    }
}