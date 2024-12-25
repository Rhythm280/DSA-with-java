package java_program;

import java.util.Scanner;

public class Main_3 {

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            String operator;
            operator = obj.next();
            if (operator.equals("+")) {
                System.out.println(a + b);
            } else if (operator.equals("-")) {
                System.out.println(a - b);
            } else if (operator.equals("*")) {
                System.out.println(a * b);
            } else if (operator.equals("/")) {
                System.out.println(a / b);
            } else {
                System.out.println("Please, Enter valid operator");
            }
        }
    }
}
