package vector;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class test01 {
    public static void main(String[] args) {
        String[] name = {"민주", "지은", "채원", "유진", "사쿠라"};

        // vector 객체 생성
        List<String> list = new Vector<String>(4,3);

        System.out.println("벡터에 저장된 요소의 개수 : " + list.size()); // 0
        System.out.println("벡터의 용량은 : " + ((Vector<String>)list).capacity()); // 4

        for (int i = 0; i < name.length; i++) {
            list.add(name[i]); // 객체 추가
        }

        System.out.println("벡터에 저장된 요소의 개수 : " + list.size()); // 5
        System.out.println("벡터의 용량은 : " + ((Vector<String>)list).capacity()); // 7

        System.out.println(list); // [민주, 지은, 채원, 유진, 사쿠라]

        list.add(1, "은비");
        System.out.println(list); // [민주, 은비, 지은, 채원, 유진, 사쿠라]

        System.out.println(list.get(3)); // 채원

        boolean ts = list.contains("채원");
        System.out.println(ts); // true

        boolean ts2 = list.contains("카즈하");
        System.out.println(ts2); // false

        list.set(2, "카즈하");
        System.out.println(list);

        list.remove(2);
        list.remove("은비");
        System.out.println(list);

        // 오름차순 정렬
        System.out.println("객체 오름 차순 정렬");
        Collections.sort(list);
        System.out.println(list);

        // 내림차순 정렬
        System.out.println("객체 내림 차순 정렬");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
