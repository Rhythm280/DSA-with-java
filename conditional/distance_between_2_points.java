package conditional;

import java.util.Scanner;

public class distance_between_2_points {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x1 = obj.nextInt();
        int y1 = obj.nextInt();
        int x2 = obj.nextInt();
        int y2 = obj.nextInt();
        obj.close();
        double ans = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double result = Math.sqrt(ans);
        System.out.println(result);
    }
}