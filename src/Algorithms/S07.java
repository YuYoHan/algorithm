package Algorithms;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a + b) % c);
        System.out.println((a % c) + (b % c) % c);
        System.out.println((a * c) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
