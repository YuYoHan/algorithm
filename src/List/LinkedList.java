package List;

public class LinkedList {
    private Node head;
    private int length;

    public LinkedList() {
        this.head = new Node();
        this.length = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
        if(length < 0) this.length =0;
    }
    public boolean isEmpty() {
        return getLength() == 0;
    }

    public void add(Object data) {
        Node newNode = new Node();
        newNode.setData(data);

        if(isEmpty()) {
            head.setNext(newNode);
        } else {
            Node node = head;
            for (int i = 0; i < length; i++) {
                node = node.getNext();
            }
            node.setNext(newNode);
        }
        setLength(length+1);
    }

    public void add(int index, Object data) {
        Node newNode = new Node();
        newNode.setData(data);

        if(index == 0) {
            if(isEmpty()) {
                head.setNext(newNode);
            } else {
                newNode.setNext(head.getNext());
                head.setNext(newNode);
            }
        } else {
            if(index <0 || index > length) throw new IndexOutOfBoundsException();
            Node node = head;
            for (int i = 0; i < index; i++) {
                node =node.getNext();
            }
            if (node.getNext() != null) {
                newNode.setNext(node.getNext());
                node.setNext(newNode);
            } else {
                node.setNext(newNode);
            }
        }
        setLength(length+1);
    }

    public void remove(int index) {
        if(isEmpty()) System.out.println("삭제할 데이터가 없습니다.");
        if (index >= length) throw new IndexOutOfBoundsException();

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setNext(node.getNext().getNext());
        setLength(length -1);
    }

    public void print() {
        if(isEmpty()) System.out.println("데이터가 없습니다.");

        Node node = head.getNext();
        for (int i = 0; i < length; i++) {
            if(node.getData() == null) break;
            System.out.print(node.getData() + " → ");
            node = node.getNext();
        }
        System.out.println();
    }

    public boolean contains(Object data) {
        Node node = head;
        for (int i = 0; i < length; i++) {
            node =node.getNext();
            if(node.getData().equals(data)) {
                System.out.println("해당 데이터가 인덱스 " + i + "에 있습니다.");
                return true;
            }
        }
        System.out.println("해당 데이터가 없습니다.");
        return false;
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }
}
