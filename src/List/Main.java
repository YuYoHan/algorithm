package List;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.print();

        linkedList.add(0, 2);
        linkedList.print();

        linkedList.add(2,0);
        linkedList.print();

        linkedList.remove(2);
        linkedList.print();

        linkedList.add(1,3);
        linkedList.print();

        linkedList.remove(1);
        linkedList.print();

        linkedList.remove(0);
        linkedList.print();

        linkedList.contains(1);
        linkedList.contains(2);

        System.out.println(linkedList.getNode(0));
        System.out.println(linkedList.getNode(1));
    }
}
