package StackAndQueue;

import java.lang.Exception;
import StackAndQueue.StackException;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int point = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int ele) throws StackException {
        if (isFull()) {
            // throw new StackException("Stack is full");
            System.out.print("Stack is full");
            return false;
        }
        point++;
        data[point] = ele;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can not pop from an empty stack");
        }
        int val = data[point];
        data[point] = 0;
        point--;
        return val;
    }

    public boolean isFull() {
        return point == data.length - 1;
    }

    public boolean isEmpty() {
        return point == -1;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return data[point];
    }
    
    public static void main(String[] args) throws StackException {
        CustomStack s = new DynamicStack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
