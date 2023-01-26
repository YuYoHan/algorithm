package List;

import java.util.LinkedList;
import java.util.List;

public class Code02 {
    public static void main(String[] args) {
        // LinkedList 생성
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(0));
        System.out.println(list.get(1));


        // 자신이 원하는 위치의 숫자 수정
        list.set(3, 7);

        for(int i : list) {
            System.out.println("전체 출력 : " + i);
        }

        System.out.println(list.remove(3));

        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            sum += i;
            System.out.println(sum);
        }
    }
}
