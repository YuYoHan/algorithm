package Algorithms;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//        System.out.println(a * b);
        // 문제가 정수를 받아서 실수형을 출력하는 거라 (double)추가
        System.out.println((double) a / b);
    }
}
