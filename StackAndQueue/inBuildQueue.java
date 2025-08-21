package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class inBuildQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(12);
        q.add(56);
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
