package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Code03 {
    static HashMap phoneBook = new HashMap();

    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name);
    }

    static void addGroup(String groupName) {
        if(!phoneBook.containsKey(groupName)) {
            phoneBook.put(groupName, new HashMap<>());
        }
    }

    static  void printList() {
        Set set = phoneBook.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry e = (Map.Entry) iterator.next();
            Set entrySet = ((HashMap) e.getValue()).entrySet();
            Iterator groupIterator = entrySet.iterator();

            System.out.println(e.getKey() + " [ " + entrySet.size() + " ] ");

            while (groupIterator.hasNext()) {
                Map.Entry e2 = (Map.Entry) groupIterator.next();
                System.out.println("이름 : " + e2.getValue() + " 번호 : " + e2.getKey());
            }
        }
    }

    public static void main(String[] args) {
        addPhoneNo("친구", "김김김", "010-1111-1111");
        addPhoneNo("친구", "이이이", "010-2222-2222");
        addPhoneNo("친구", "최최최", "010-3333-3333");

        addPhoneNo("가족", "박박박", "010-4444-4444");
        addPhoneNo("가족", "효효효", "010-5555-5555");

        printList();

    }
}
