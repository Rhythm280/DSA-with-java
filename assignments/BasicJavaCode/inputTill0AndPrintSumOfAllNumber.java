package assignments.BasicJavaCode;

import java.util.Scanner;

public class inputTill0AndPrintSumOfAllNumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = 1;
            int sum = 0;
            while (n != 0) {
                n = obj.nextInt();
                sum += n;
            }
            System.out.println(sum);
        }
    }
}
