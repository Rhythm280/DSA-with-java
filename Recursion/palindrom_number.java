package Recursion;

public class palindrom_number {

    public static void main(String[] args) {
        System.out.println(palindrom(1221));
    }

    public static int reverse_of_number(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    public static boolean palindrom(int n) {
        return reverse_of_number(n) == n;
    }

    public static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }
}
