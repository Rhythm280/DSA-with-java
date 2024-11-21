package java_program;

import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int first_num = 0, second_num = 1;
        System.out.println("Fibonachi Series: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(first_num + " ");
            int next_num = first_num + second_num;
            first_num = second_num;
            second_num = next_num;
        }
        obj.close();
    }
}
