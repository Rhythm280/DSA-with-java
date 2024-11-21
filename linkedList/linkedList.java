package linkedList;

public class linkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static linkedList biginsertion(linkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = list.head;
        list.head = new_node;
        return list;
    }

    public static linkedList deletonatend(linkedList list) {
        Node slow = null;
        Node fast = list.head;
        while (fast.next != null) {
            slow = fast;
            fast = fast.next;
        }
        slow.next = null;
        return list;
    }

    public static linkedList delitionatbg(linkedList list) {
        if (list.head == null) {
            return list;
        } else {
            Node temp = list.head;
            list.head = temp.next;
        }
        return list;
    }

    public static linkedList nextElement(linkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void print(linkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.err.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list = biginsertion(list, 10);
        list = biginsertion(list, 11);
        list = biginsertion(list, 12);
        list = biginsertion(list, 13);
        list = biginsertion(list, 14);
        list = delitionatbg(list);
        print(list);
    }
}
