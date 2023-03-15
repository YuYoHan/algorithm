package datastructure.part01;

import java.util.Scanner;

public class sty01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다");
        // 1
        System.out.println("a의 값 : ");
        int a = sc.nextInt();

        // 3
        System.out.println("b의 값 : ");
        int b = sc.nextInt();

        // 2
        System.out.println("c의 값 : ");
        int c = sc.nextInt();

        // 1을 max에 대입
        int max = a;
        // b 즉, 3이 1보다 크면 3을 max에 대입
        if(b > max) max = b;
        // c는 2므로 max(3)보다 작다 그렇기 때문에 대입x
        if(c > max) max = c;

        System.out.println("최대값은 " + max + "입니다.");

    }


}
