package Recursion;

public class patterns {

    public static void main(String[] args) {
        invertedTriangle(5, 0);
        triangle(5, 0);
    }

    public static void invertedTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("x ");
            invertedTriangle(r, c + 1);
        } else {
            System.out.println();
            invertedTriangle(r - 1, 0);
        }
    }

    public static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            triangle(r, c + 1);
            System.out.print("x ");
        } else {
            triangle(r - 1, 0);
            System.out.println();
        }
    }
}
