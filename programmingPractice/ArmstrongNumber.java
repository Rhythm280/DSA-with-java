package programmingPractice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(isArmstrong(i)) {
                System.out.println(i + " is armstrong number");
            }
        }
    }

    public static boolean isArmstrong(int n)  {
        int original = n;
        int power = findDigit(n);
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            int p = 1;
            for(int i = 0; i < power; i++) {
                p *= n;
            }
            sum += p;
            n /= 10;
        }
        if(sum != original) {
            return false;
        }
        return true;
    }

    public static int findDigit(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
