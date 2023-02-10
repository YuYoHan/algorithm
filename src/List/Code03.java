package List;

import java.util.ArrayList;
import java.util.List;

public class Code03 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(90);
        list.add(80);
        list.add(85);
        list.add(100);
        list.add(75);


        System.out.println(list);

        list.add(2, 92);
        list.set(1, 99);
        list.remove(4);
        System.out.println(list);
    }
}
