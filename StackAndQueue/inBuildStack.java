package StackAndQueue;

import java.util.Stack;

public class inBuildStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(34);
        s.push(24);
        s.push(14);
        s.pop(); // it return an value which is getting removed from the stack.
        for(int i : s) {
            System.out.println(i);
        }
    }
}
