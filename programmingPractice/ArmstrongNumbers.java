package programmingPractice;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        for(int i = 10; i <= 200; i++) {
            if(isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrong(int n) {
        int original = n;
        int power = digites(n);
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            int pow = 1;
            for(int i = 0; i < power; i++) {
                pow *= 
            }
        }
    }
}
