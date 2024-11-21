package placement_training;
import java.util.Scanner;

public class proble1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double a = obj.nextInt();
        for(int i = 1; i < 10; i++){
            System.out.print(i + ", ");
        }
        System.out.println(10);
        double last = a % 10;
        // while(a > 10){
        //     a = a / 10;
        // }
        double noOfDigits = Math.log10(a);
        // System.out.println((noOfDigits) + 1);
        double first = a / Math.pow(10, (int)noOfDigits);

        System.out.println("last number: "+ (int)last);
        System.out.println("first number: "+ (int)first);
        obj.close();
    }
}
