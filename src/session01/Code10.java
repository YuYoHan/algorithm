package session01;

import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = 0; j < n; j++) {
                sum += data[j];
                if(sum > max) {
                    max = sum;
            }
            }
        }
    }
}
