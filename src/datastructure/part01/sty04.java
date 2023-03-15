package datastructure.part01;

public class sty04 {
    static int min(int a, int b, int c) {
        int min = 0;
        min = a;

        if(min > b) min = b;
        if(min > c) min = c;
        return min;
    }

    public static void main(String[] args) {
        System.out.println("min(3,2,1) = " + min(3, 2, 1));
    }
}
