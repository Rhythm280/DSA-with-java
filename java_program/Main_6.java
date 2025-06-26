package java_program;

import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        // int num = number, remainder, n = String.valueOf(number).length(), sum = 0;
        // while (num != 0) {
        // remainder = num % 10;
        // sum += Math.pow(remainder, n);
        // num /= 10;
        // }

        int num = number;
        int count = 0;
        int sum = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }

        int n = number;
        while (n != 0) {
            int power = 1;
            int digit = n % 10;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }
            sum += power;
            n /= 10;
        }

        if (number == sum) {
            System.out.println(number + " is a armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }

        obj.close();

        for (int i = 100; i <= 200; i++) {
            System.out.println(fibonachiSeries(i));
        }
    }

    public static int fibonachiSeries(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 1; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2 - n1;
    }
}