package conditional;

import java.util.Scanner;

public class calculate_commission_percentage {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double sales = obj.nextInt();
        double rate = obj.nextInt();
        obj.close();
        double commision = (sales * rate) / 100;
        double commisionRate = (commision / sales) * 100;
        System.out.println(commision);
        System.out.println(commisionRate);
    }
}