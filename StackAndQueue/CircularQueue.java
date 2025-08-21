package StackAndQueue;

public class CircularQueue {
    protected int front = 0;
    protected int end = 0;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int ele) {
        if (isFull()) {
            return false;
        }
        data[end++] = ele;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int val = data[front++];
        front = front % data.length;
        size--;
        return val;
    }
    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        CircularQueue q = new CircularQueue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.display();
        q.remove();
        q.display();
        q.insert(121);
        q.display();
    }
}
