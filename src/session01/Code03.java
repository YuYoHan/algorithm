package session01;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        int num = 123;

        Scanner sc = new Scanner(System.in);

        System.out.print("입력하세요 : ");
        int input = sc.nextInt();

        if(input == num) {
            System.out.println("Number match!");
        } else {
            System.out.println("Number do not match!");
        }
    }
}
