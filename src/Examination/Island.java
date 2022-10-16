package Examination;

import java.util.*;

public class Island {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<ArrayList<Edge>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new ArrayList<>());
        }
        int[] input = new int[3];
        String ttt = sc.nextLine();
        while (true) {
            String s = sc.nextLine();
            if (s.equals("")) break;
            Scanner sc2 = new Scanner(s);
            int temp = 0;
            while (sc2.hasNextInt()) {
                input[temp++] = sc2.nextInt();
            }
            edges.get(input[0]-1).add(new Edge(input[0]-1, input[1]-1, input[2]));
        }
        int[] nodes = new int[N];
        for (int i = 0;i < N;i++){
            nodes[i]=Integer.MAX_VALUE;
        }
        nodes[K-1]=0;
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.t));
        pq.addAll(edges.get(K-1));
        Edge top;
        while (!pq.isEmpty()) {
            top = pq.poll();
            int cur = nodes[top.s] + top.t;
            if (cur < nodes[top.d]) {
                nodes[top.d] = cur;
                for (Edge edge : edges.get(top.d)){
                    if (nodes[top.d]+nodes[edge.t] <= nodes[edge.d]) pq.add(edge);
                }
            }
        }
        int max = 0;
        for (int i : nodes) if (i>max) max = i;
        System.out.println(max==Integer.MAX_VALUE?-1:max);
    }


    static class Edge {
        int s;
        int d;
        int t;

        public Edge(int s, int d, int t) {
            this.s = s;
            this.d = d;
            this.t = t;
        }
    }
}
