package Array;

public class Code01 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "melon"};
        String[] copyFruits = fruits.clone(); // fruits 배열을 복사
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits : " + fruits[i]);
            System.out.println("copyFruits : " + copyFruits[i]);
        }
    }
}
