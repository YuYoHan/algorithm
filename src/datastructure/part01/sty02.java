package datastructure.part01;

public class sty02 {
    static  int max(int a, int b, int c) {
        int max = a;
        if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
            return max;
        }
    }
    public static void main(String[] args) {
        /*
        *   여기서는 여러개의 값에 대해서 최대값을 구하고자 합니다.
        * */
        System.out.println("max(3,2,1) = " + max(3,2,1));
        System.out.println("max(3,2,2) = " + max(3,2,2));
        System.out.println("max(3,1,2) = " + max(3,1,2));
        System.out.println("max(3,2,3) = " + max(3,2,3));
        System.out.println("max(2,1,3) = " + max(2,1,3));
        
    }
}
