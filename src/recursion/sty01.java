package recursion;

public class sty01 {
    public static int lenth(String str) {
        if(str.equals("")) {
            return 0;
        } else {
            return 1+lenth(str.substring(1));
        }
    }

    public static void main(String[] args) {
        lenth("java");
    }
}
