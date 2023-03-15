package datastructure.part01;

import java.util.Scanner;

public class sty07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        // i가 n이하면 반복한다.
        while (i <= n) {
            // sum에 i를 더합니다.
            sum += i;
            // i값을 1만큼 증가시킵니다.
            i++;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
