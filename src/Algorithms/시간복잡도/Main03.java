package Algorithms.시간복잡도;

public class Main03 {
    public static void main(String[] args) {
        int n = 100000;
        int cnt = 0;

        // 3개의 for문을 돌면 30만번이다.
        // 그러면 3N이다.
        // 근데 앞의 상수인 3을 제외하기 때문에 O(n)이다.
        for (int i = 0; i < n; i++) {
            System.out.println("연산 횟수 : " + cnt++);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("연산 횟수 : " + cnt++);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("연산 횟수 : " + cnt++);
        }


    }
}
