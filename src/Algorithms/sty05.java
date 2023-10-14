package Algorithms;

import java.util.Map;
import java.util.Scanner;

// DFS - 재귀 호출
public class sty05 {
    static final int MAX_N = 10;
    static int N, E;
    static int[][] graph = new int[MAX_N][MAX_N];
    static boolean[] visited = new boolean[MAX_N];

    static void dfs(int node){
        visited[node] = true;
        System.out.println(node + "");

        for (int next = 0; next < N; next++) {
            if(!visited[next] && graph[node][next] != 0)
                dfs(next);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        E = scanner.nextInt();

        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph[u][v] = graph[v][u] = 1;
        }
        dfs(0);
    }
}
