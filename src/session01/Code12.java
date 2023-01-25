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

        for (int i = n-1; i >0; i--) {
            // data[0] ... data[i]
            for (int j = 0; j < i; j++) {
                if(data[j] > data[j +1]) {
                    // swap data[j] and data[j+1]
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
        System.out.println("Sorted data : ");
        for (int i = 0; i < n; i++) {
            System.out.println(data[i]);
        }
    }
}
