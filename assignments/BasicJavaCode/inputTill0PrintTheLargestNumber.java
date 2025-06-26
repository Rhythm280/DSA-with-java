package assignments.BasicJavaCode;

import java.util.ArrayList;
import java.util.Scanner;

public class inputTill0PrintTheLargestNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // try (Scanner obj = new Scanner(System.in)) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 1;
        while (n != 0) {
            n = obj.nextInt();
            list.add(n);
        }
        largestNumber(list, 0, 0);
        // }
    }

    public static void largestNumber(ArrayList<Integer> list, int max, int i) {
        if (i == list.size() - 1) {
            System.out.println(max);
            // System.out.println(list.indexOf(max));
            return;
        }

        if (i < list.size()) {
            if (list.get(i) > max) {
                max = list.get(i);
                largestNumber(list, max, i + 1);

            } else {
                largestNumber(list, max, i + 1);
            }
        }

    }
}
