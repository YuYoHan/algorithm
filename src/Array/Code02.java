package Array;

public class Code02 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "melon", "banana"};
        String[] newFruits = new String[5];
        // arraycopy(복사할 배열, 시작 위치, 새 배열, 새 배열 시작 위치, 복수 갯수) 4개의 인수를 받는다.
        // 지정된 위치를 받기 떼문에 기존 존재하는 배열에 새로 복제하는 경우에 유용하게 사용된다.
        System.arraycopy(fruits,0,newFruits,0, 3);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("copyFruits : " + newFruits[i]);
        }
    }
}
