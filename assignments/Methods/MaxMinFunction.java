package assignments.Methods;

import java.util.Scanner;

public class MaxMinFunction {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        System.out.println(max(a, b, c));
        System.out.println(min(a, b, c));
    }

    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        }
        if (b > c) {
            return b;
        }
        return c;
    }

    public static int min(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        }
        if (b < c) {
            return b;
        }
        return c;
    }
}
