package assignments.BasicJavaCode;

import java.util.Scanner;

public class sumOfNegativeNumberAndPositiveEvenAndOddNumberFromTheList {

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            int sumOfNegativeNum = 0;
            int sumOfPositiveEvenNum = 0;
            int SumOfPositiveOddNum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = obj.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    sumOfNegativeNum = +arr[i];
                } else {
                    if (arr[i] % 2 == 0) {
                        sumOfPositiveEvenNum += arr[i];
                    } else {
                        SumOfPositiveOddNum += arr[i];
                    }
                }
            }
            System.out.println(sumOfNegativeNum);
            System.out.println(SumOfPositiveOddNum);
            System.out.println(sumOfPositiveEvenNum);
        }
    }
}
