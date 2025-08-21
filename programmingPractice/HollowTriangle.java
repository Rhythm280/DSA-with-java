
import java.util.HashMap;
import java.util.Stack;

public class HollowTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n - 1; j >= i; j--) {
                if (i == 0 || i == n - 1 || j == n - 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int m = arr.length / 2;
            if (arr[m] == target) {
                System.out.println(target + " is at " + (m + 1));
                break;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        String str = "welcome to 360 degree cloud";
        str = str.toLowerCase();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (freq.containsKey(ch)) {
                    freq.put(ch, freq.get(ch) + 1);
                } else {
                    freq.put(ch, 1);
                }
            }
        }
        System.out.println(freq.entrySet().toString());

        String str1 = "([{]})";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            }

            if(ch == ')' && stack.peek() == '(') {
                stack.pop();
            }

            if(ch == ']' && stack.peek() == '[') {
                stack.pop();
            }

            if(ch == '}' && stack.peek() == '{') {
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
                System.out.println("Stack is valid");
        } else {
                System.out.println("Stack is invalid");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max2) {
                max2 = arr[i];
            }

            if(arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
        }
        System.out.println(max2);
    }
}