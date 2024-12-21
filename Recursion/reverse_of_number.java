package Recursion;

public class reverse_of_number {

    public static void main(String[] args) {
        System.out.println(reverse(12365));;
    }

    public static int reverse(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    public static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }
}
