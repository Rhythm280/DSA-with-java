package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class inBuildDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        // ArrayDeque is the resizable array implementaton of the Deque interface.
        dq.add(89);
        dq.add(79);
        dq.add(69);
        dq.add(59);
        dq.removeFirst();
        dq.removeLast();
    }
}