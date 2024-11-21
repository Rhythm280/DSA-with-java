package java_program;
import java.util.Scanner;

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
        // int a = 13;
        // int c = 2;
        // while(a/2 >= c){
        // if(a%c==0){
        // System.out.println("not prime");
        // }
        // else{
        // c++;
        // }
        // }
        // System.out.println("prime");

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
        Scanner obj = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the opertor: ");
            char ch = obj.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.print("Enter 2 numbers: ");
                int a = obj.nextInt();
                int b = obj.nextInt();
                if (ch == '+') {
                    ans = a + b;
                }
                if (ch == '-') {
                    ans = a - b;
                }
                if (ch == '*') {
                    ans = a * b;
                }
                if (ch == '/') {
                    ans = a / b;
                }
                if (ch == '%') {
                    ans = a % b;
                }
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println("Solution: " + ans);
        }
        obj.close();
    }
}