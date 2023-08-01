package brute_force;

import java.util.Scanner;

public class sty07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            if(n == Constract(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    private static int Constract(int i) {
        int a = i;
        String tmp = Integer.toString(i);

        for(char c : tmp.toCharArray()) {
            a = Character.getNumericValue(c);
        }
        return a;
    }
}
