package datastructure.part01;

import java.util.Scanner;

// 3개의 정수값을 입력하고 중앙값을 구한 다음 출력합니다.
public class sty05 {
    static int med (int a, int b, int c) {
        if(a > b) {
            if (b > c){
                return b;
            } else if(a <= c) {
                return a;
            } else {
                return c;
            }
        }else if(a > c) {
            return a;
        } else if(b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값 : ");
        int a = sc.nextInt();

        System.out.println("b의 값 : ");
        int b = sc.nextInt();

        System.out.println("c의 값 : ");
        int c = sc.nextInt();

        System.out.println("중앙값은 " + med(a,b,c) + "입니다.");
    }
}
