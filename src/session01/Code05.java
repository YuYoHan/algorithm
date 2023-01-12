package session01;

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        String name = null;
        int age;
        String gender;

        Scanner sc = new Scanner(System.in);

        name = sc.next();
        age = sc.nextInt();
        gender = sc.next();

        if (gender.equals("male")) {
            System.out.println(name + ", you're " + age + " years man");
        } else {
            System.out.println(name + ", you're " + age + " years woman");
        }
    }
}
