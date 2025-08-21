package linkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void inserAtStart(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        head = node;
        size++;
    }

    public void insertionAtEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            System.out.print("START -> ");
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
            System.out.println("END");
        }
    }

    public int delete(int val) {
        int value = 0;
        Node temp = head;
        if(temp == null) {
            return -1;
        }
        if(temp.val == val) {
            value = head.val;
            head = head.next;
            tail.next = head;
            return value;
        }

        do {
            Node n = temp.next;
            if(n.val == val) {
                val = n.val;
                temp.next = n.next;
                break;
            }
        } while(temp != head);
        return value;
    }

    public static void main(String[] args) {
        CircularLinkedList l = new CircularLinkedList();
        l.inserAtStart(10);
        l.inserAtStart(20);
        l.inserAtStart(30);
        l.display();
        System.out.println(l.delete(30));
        l.display();
    }
}
