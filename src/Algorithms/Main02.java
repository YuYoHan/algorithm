package Algorithms;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        double doubleNum = sc.nextDouble();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<b) {
            System.out.println("<");
        } else if(a>b) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }
}
