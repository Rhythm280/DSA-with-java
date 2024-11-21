package conditional;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int fact = 1;
        obj.close();
        if(n == 0) {
            System.out.println(1);
        }
        else {
            for(int i = 1; i <= n; i++) {
                fact *= i;
                System.out.println(fact);
            }
        }
    }
}