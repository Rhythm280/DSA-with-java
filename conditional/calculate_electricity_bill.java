package conditional;

import java.util.Scanner;

public class calculate_electricity_bill {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int unitConsumed = obj.nextInt();
        int bill = 0;
        obj.close();
        if(unitConsumed <= 500) {
            bill = 0;
        }
        else {
            if(unitConsumed <= 2000) {
                bill = (unitConsumed - 500) * 50;
            }
            else {
                bill = (unitConsumed - 2000) * 100 + 75000;
            }
        }
        System.out.println(bill);
    }
}