package assignments.Methods;

import java.util.Scanner;

public class allPrimeNumbersBetweenTwoGivenNumber {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int start = obj.nextInt();
        int end = obj.nextInt();
        for (int i = start; i <= end; i++) {
            if (isprime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
