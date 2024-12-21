package Recursion;

public class range_of_n {

    public static void main(String[] args) {
        function_1(5);
        System.out.println();
        function_2(5);
        System.out.println();
        bothOrder(5);
    }

    public static void function_1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        function_1(n - 1);
    }
    public static void function_2(int n) {
        if (n == 0) {
            return;
        }
        function_2(n - 1);
        System.out.print(n + " ");
    }
    public static void bothOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        bothOrder(n - 1);
        System.out.print(n + " ");
    }
}
