package assignments.Methods;

import java.util.Scanner;

public class circumfrenceAndAreaOfCircle {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int radius = obj.nextInt();
        System.out.println(circumfrence(radius));
        System.out.println(area(radius));
        obj.close();
    }

    public static double circumfrence(int radius) {
        double pi = 22 / 7;
        return 2 * pi * radius;
    }

    public static double area(int radius) {
        double pi = 22 / 7;
        return pi * radius * radius;
    }
}
