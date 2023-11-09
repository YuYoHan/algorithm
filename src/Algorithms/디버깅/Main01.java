package Algorithms.디버깅;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        // TODO 배열에서 주어진 범위의 합을 구하는 프로그램을 구하시오
        Scanner sc = new Scanner(System.in);

        int testCase = 0;
        int answer = 0;
        int A[] = new int[100001];
        int S[] = new int[100001];
        for (int i = 0; i < 10000; i++) {
            A[i] = (int) (Math.random() * Integer.MAX_VALUE);
            S[i] = S[i -1] + A[i];
        }
        for (int t = 0; t < testCase; t++) {
            int query = sc.nextInt();
            for (int i = 0; i < query; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                answer += S[end] - S[start - 1];
                System.out.println(testCase + " " + answer);
            }
        }
    }
}
