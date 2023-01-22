package session01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Code11 {
    public static void main(String[] args) {
        List<Integer> arlist = new ArrayList<>();

        // 추가
        arlist.add(10);
        arlist.add(20);
        arlist.add(30);
        arlist.add(40);
        arlist.add(1, 50);
        System.out.println(arlist);

        // 삭제
        arlist.remove(1);
        System.out.println(arlist);

        // 가져오기
        System.out.println(arlist.get(3));

        // 몇개가 저장되어 있는지
        System.out.println(arlist.size());

        Iterator it = arlist.iterator();
        while (it.hasNext()) {
            int value = (int)it.next();
            System.out.println(value);
        }
    }
}
