package linkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertAtStatr(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size += 1;
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

    // O(1) complexity
    public void insertAtEndWithTail(int val) {
        if (tail == null) {
            insertAtStatr(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    // O(n) complexity
    public void inserAtEndWithHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
        size++;
    }

    public void inserionInMiddle(int i, int val) {
        if (i == 0) {
            insertAtStatr(val);
            return;
        }

        if (i == size) {
            insertAtEndWithTail(val);
            return;
        }

        Node temp = head;
        for (int j = 1; j < i; j++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFromStart() {
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int deleteFromEnd() {
        if (size <= 1) {
            return deleteFromStart();
        }
        Node secondLast = getIndex(size - 2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    Node getIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFromMiddle(int index) {
        if (index == 0) {
            return deleteFromStart();
        }
        if (index == size - 1) {
            return deleteFromEnd();
        }

        Node previousNode = getIndex(index - 1);
        int val = previousNode.next.data;
        previousNode.next = previousNode.next.next;
        size--;
        return val;
    }

    Node find(int value) {
        Node node = head;
        int i = 0;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            i++;
            node = node.next;
        }
        return null;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    public Node insertRec(int val, int index, Node temp) {
        if (index == 0) {
            Node node = new Node(val);
            size++;
            return node;
        }
        temp.next = insertRec(val, index - 1, temp.next);
        return temp;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtStatr(10);
        l.insertAtStatr(20);
        l.insertAtStatr(30);
        l.insertAtEndWithTail(40);
        l.inserAtEndWithHead(50);
        l.inserionInMiddle(3, 60);
        l.display();
        System.out.println(l.deleteFromStart());
        l.display();
        System.out.println(l.deleteFromEnd());
        l.display();
        System.out.println(l.deleteFromMiddle(2));
        l.display();
        System.out.println(l.find(40));
        l.insertRec(70, 2, l.head);
        l.display();
    }
}
