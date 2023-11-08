package Algorithms.시간복잡도;

public class Main04 {
    public static void main(String[] args) {
        int n = 100000;
        int cnt = 0;
        // 시간 복잡도는 가장 많이 중첩된 반복문을 기준으로 도출하므로 이 코드에서는 이중 for문이
        // 전체 코드의 시간 복잡도 기준이 됩니다.
        // 그렇기 때문에 O(n²)이다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("연산 횟수 : " + cnt++);
            }
        }

    }
}
