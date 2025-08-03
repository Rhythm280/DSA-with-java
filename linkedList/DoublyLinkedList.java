package linkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void inserInStart(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null) {
            head.prev = node; // check for null pointer exception
        }
        if (tail == null)
            tail = node;
        head = node;
        node.prev = null;
        size++;
    }

    public void display() {
        Node temp = head;
        System.out.print("START -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void inserAtEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head.prev = null;
            head = node;
            tail.next = null;
            tail = node;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        size++;
    }

    public void insertionMiddle(int i, int val) {
        if (i == 0) {
            inserInStart(val);
            return;
        }
        if (i == size) {
            inserAtEnd(val);
            return;
        }

        Node temp = head;
        for (int j = 1; j < i; j++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        if (temp.next != null) {
            temp.next.prev = node;
        }
        temp.next = node;
        size++;
    }

    Node findNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFromStart() {
        head.next.prev = null;
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int deleteFromEnd() {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        int val = temp.data;
        temp = temp.prev;
        temp.next = null;
        size--;
        return val;
    }

    public int deleteFromMiddle(int index) {
        if(index == 0) {
            return deleteFromStart();
        }
        if(index == size - 1) {
            return deleteFromEnd();
        }

        Node prevNode = findNode(index - 1);
        int val = prevNode.next.data;
        prevNode.next = prevNode.next.next;
        prevNode.next.prev = prevNode;
        size--;
        return val;
    }

    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.inserInStart(40);
        l.inserInStart(30);
        l.inserInStart(20);
        l.inserAtEnd(10);
        l.inserAtEnd(20);
        l.insertionMiddle(2, 100);
        l.display();
        l.insertionMiddle(1, 200);
        l.display();
        l.insertionMiddle(0, 300);
        l.display();
        System.out.println(l.deleteFromStart());
        System.out.println(l.deleteFromEnd());
        System.out.println(l.deleteFromEnd());
        System.out.println(l.deleteFromMiddle(2));
        System.out.println(l.deleteFromMiddle(1));
        System.out.println(l.deleteFromMiddle(2));
        l.display();
    }
}
