package session01;

import java.util.Scanner;

public class Code12 {
    public static void main(String[] args) {
        /*
        *   사용자로부터 n개의 정수를 입력받은 후 오름차순으로 정렬(sort)하여 출력하는 코드
        *
        * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        sc.close();

    }
}
