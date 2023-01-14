package session01;

import java.util.Scanner;

public class Code09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(data[i] == data[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
