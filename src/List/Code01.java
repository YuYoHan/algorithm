package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Code01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);

        list.get(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println(num);
        }

        for (int num2 : list) {
            System.out.println(num2);
        }

        list.remove(1);

    }
}
