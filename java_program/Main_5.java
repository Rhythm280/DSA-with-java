package java_program;

import java.util.Scanner;

public abstract class Main_5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int sum = 0;
        int div = num;
        int remainder;
        while (div != 0) {
            remainder = div % 10;
            sum = sum * 10 + remainder;
            div = div / 10;
        }
        if (num == sum) {
            System.out.println(num + " is a palindrom number");
        } else {
            System.out.println(num + " is not a palindrom number");
        }
        obj.close();
    }
}