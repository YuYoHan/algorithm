package session01;

public class Code02 {
    static int num;
    public static void main(String[] args) {
        int otherNum = 5;
        num = 2;

        System.out.println(num + otherNum);
        System.out.println("num : " + num);
        System.out.println("otherNum : " + otherNum);
        System.out.println("sum : "  + num + otherNum); // 25
        System.out.println("sum : "  + (num + otherNum)); // 7

    }
}
