package Algorithms;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        // 불기 연도를 서기 연도로 변환하는 결과
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        // 불기 연도(y) - 543 = 서기 연도(x)
        System.out.println(y - 543);
    }
}
