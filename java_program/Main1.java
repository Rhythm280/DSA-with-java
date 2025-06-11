package java_program;

import java.util.ArrayList;
import java.lang.Math;

public class Main1 {
    public static void main(String[] args) {
        // Condiationanls statemets: if else() statement
        // int b = 13;
        // if(b % 2 == 0){
        // System.out.println("Even");
        // }
        // else{
        // System.out.println("odd");
        // }

        // for loop
        // int n = 5;
        // int fact = 1;
        // for (int i = 1; i <= n; i++){
        // fact*=i;
        // }
        // System.out.println(fact);

        // while loop
        int a = 13;
        int c = 2;
        boolean res1 = true;
        while (a / 2 >= c) {
            if (a % c == 0) {
                res1 = false;
            } else {
                c++;
            }

        }
        if (res1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }


        int num = 19;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++; 
            }
        }
        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        ArrayList<Integer> A = new ArrayList<>();
        A.add(-98);
        A.add(-5);
        A.add(37);
        A.add(-97);
        A.add(38);
        A.add(22);
        A.add(70);
        A.add(42);
        A.add(61);
        A.add(84);
        int currentMax = 0;
        int max = 0;
        int res;
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < A.size(); j++) {
                res = Math.abs(A.get(i) - A.get(j) + Math.abs(i - j));
        System.out.println(res);
                currentMax = Math.max(currentMax, res);
                // max = Math.max(currentMax, max);
            }
        }

        System.out.println(currentMax);
        
        // do while loop
        // int num = 1;
        // int facto = 1;
        // do{
        // facto *= num;
        // num++;
        // }
        // while(num <= 10);
        // System.out.println(facto);

        // question-1
        // int n1 = 10;
        // int n2 = 12;
        // int n3 = 8;
        // int max = n1;

        // if(n2 > max){
        // max = n2;
        // }
        // if(n3 > max){
        // max = n3;
        // }
        // System.out.println(max);

        // int max = Math.max(n2, Math.max(n1, n2));
        // System.out.println(max);

        // // question-2
        // int number = 1385757879;
        // int count = 0;
        // while(number > 0){
        // int remainder = number % 10;
        // number = number / 10;
        // if(remainder == 7){
        // count++;
        // }
        // }
        // System.out.println(count);

        // question-3
        // int n = 123454;
        // int rev_n = 0;
        // while(n > 0){
        // int remainder = n % 10;
        // n = n / 10;
        // rev_n = rev_n * 10 + remainder;
        // }
        // System.out.println(rev_n);

        // calculator program
        // Scanner obj = new Scanner(System.in);
        // int ans = 0;
        // while (true) {
        //     System.out.print("Enter the opertor: ");
        //     char ch = obj.next().trim().charAt(0);
        //     if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
        //         System.out.print("Enter 2 numbers: ");
        //         int a = obj.nextInt();
        //         int b = obj.nextInt();
        //         if (ch == '+') {
        //             ans = a + b;
        //         }
        //         if (ch == '-') {
        //             ans = a - b;
        //         }
        //         if (ch == '*') {
        //             ans = a * b;
        //         }
        //         if (ch == '/') {
        //             ans = a / b;
        //         }
        //         if (ch == '%') {
        //             ans = a % b;
        //         }
        //     } else if (ch == 'x' || ch == 'X') {
        //         break;
        //     } else {
        //         System.out.println("Invalid Operation");
        //     }
        //     System.out.println("Solution: " + ans);
        // }
        // obj.close();
    }
}