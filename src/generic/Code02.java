package generic;

import java.util.ArrayList;

public class Code02 {
    public static void main(String[] args) {
        // 제네릭을 사용하면 타입변환이 필요하지 않습니다.
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello world");
        String tmp = list.get(0);
    }
}
