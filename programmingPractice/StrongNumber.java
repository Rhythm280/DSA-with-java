package programmingPractice;

public class StrongNumber {
    public static void main(String[] args) {
        int num = 1450;
        int original  = num;
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            int fact = fact(digit);
            sum += fact;
            num /= 10;
        }
        if(sum == original) {
            System.out.println(original + " is a strong number");
        } else {
            System.out.println(original + " is not a strong number");
        }
    }

    public static int fact(int num) {
        if(num <= 1) {
            return 1;
        }
        return num * fact(num - 1);
    }
}
