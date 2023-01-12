package session01;

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {

        String str = "Hello";
        String input = null;

        Scanner sc = new Scanner(System.in);

        input = sc.next();

        // 문자열 비교
        if(str.equals(input)){
            System.out.println("O");
        } else {
            System.out.println("X");
        }
        sc.close();
    }
}
