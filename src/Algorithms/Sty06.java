package Algorithms;

import java.util.Scanner;
import java.util.Stack;

public class Sty06 {
    static final int MAX_N = 10;
    static int N, E;
    static int[][] graph = new int[MAX_N][MAX_N];
    static boolean[] visited = new boolean[MAX_N];

    static void dfs(int node){
       boolean[] visited = new boolean[MAX_N];
        Stack<Integer> mystack = new Stack<>();
        mystack.push(node);

        while (!mystack.empty()) {
            int curr = mystack.pop();

            if(visited[curr]) continue;

            visited[curr] = true;
            System.out.println(curr + "");

            for (int next = 0; next < N; ++next) {
                if(!visited[next] && graph[curr][next] != 0) {
                    mystack.push(next);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        E = scanner.nextInt();

        for (int i = 0; i < E; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph[u][v] = graph[v][u] = 1;
        }
        dfs(0);
    }

}
