package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Code02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", null);
        map.put(null, "50");

        // 지정된 키에 대한 값을 받는다.
        String value = map.get("3");
        System.out.println("Key :3, Value : " + value);

        // 지정된 키에 대한 값이 없으면 기본 값을 반환
        value = map.getOrDefault("5", "0");
        System.out.println("Key : 5, Value : " + value );

        // 키의 존재 여부 확인
        System.out.println("2번 키의 존재 여부 : " +map.containsKey("2"));
        System.out.println("3번 값의 존재 여부 : " +map.containsValue("3"));

        // Map에 저장된 전체 항목을 얻어온다.
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        // 키의 전체 목록을 얻어온다.
        Set<String> keySet = map.keySet();
        for (String key: keySet
             ) {
            System.out.println(key + " : " + map.get(key));
        }

        // 지정된 키의 항목을 지운다.
        value = map.remove(null);
        System.out.println("삭제된 값 : " + value);

        // 삭제된 후 출력
        for (String key : keySet
        ) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
