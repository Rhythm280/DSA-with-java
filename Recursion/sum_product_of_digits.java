package Recursion;

public class sum_product_of_digits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
        System.out.println(productOfDigits(123));
    }

    public static int sumOfDigits(int n) {
        if(n == 0) {
            return 0;
        }
        return sumOfDigits(n / 10) + (n % 10); 
    }
    
    public static int productOfDigits (int n) {
        if(n % 10 == n) {
            return n;
        }
        return productOfDigits(n / 10) * (n % 10); 
    }
}
