package Algorithms;

public class Main01 {
    static final int MAX_N = 10;
    static int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int N;
    static int[][] board = new int[MAX_N][MAX_N];
    static class point {
        point(int r, int c) {
            row = r;
            col = c;
        }
        int row, col;
    }
}
