package Algorithms.시간복잡도;

public class Main02 {
    public static void main(String[] args) {
        // 시간 복잡도 O(n)
        int n = 100000;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("연산 횟수 : " + cnt++);
        }
    }
}
