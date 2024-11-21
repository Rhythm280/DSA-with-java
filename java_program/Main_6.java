package java_program;

import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int num = number, remainder, n = String.valueOf(number).length(), sum = 0;
        while (num != 0) {
            remainder = num % 10;
            sum += Math.pow(remainder, n);
            num /= 10;
        }

        if (number == sum) {
            System.out.println(number + " is a armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }

        obj.close();
    }
}
