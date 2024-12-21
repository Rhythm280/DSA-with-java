package Recursion;

public class sum_of_numbers {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
    public static int sum(int n) {
        if(n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
