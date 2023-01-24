package map;

import java.util.HashMap;
import java.util.Map;

public class Code01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        // key는 중복을 허용하지 않고 value는 중복을 허용한다.
        map.put("김씨", "어부");
        map.put("이씨", "어부");
        map.put("박씨", "어부");

        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // 순서가 유지되지 않는것을 정확히 보기 위해서 value에 숫자를 넣어서 확인
        Map<String , Integer> map2 = new HashMap<>();

        map2.put("김", 1);
        map2.put("이", 2);
        map2.put("박", 3);
        map2.put("서", 4);

        for (String key2 : map2.keySet()) {
            System.out.println(key2 + " : " + map2.get(key2));
        }

        // map에 키가 있는지를 조사하여 그 결과값을 리턴한다.
        System.out.println(map2.containsKey("김"));

        // 삭제
        System.out.println(map2.remove("서"));

        // map의 갯수를 리턴
        System.out.println(map2.size());


    }
}
