package generic;

import java.util.ArrayList;

public class Code01 {
    public static void main(String[] args) {
        // 제네릭을 사용하지 않을 경우
        ArrayList list = new ArrayList();
        list.add("test");
        // 타입 형변환이 필요하다.
        String test = (String) list.get(0);


        // 제네릭을 사용할 경우
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("test");
        // 형변환이 필요 없음
        test = list2.get(0);
    }
}
