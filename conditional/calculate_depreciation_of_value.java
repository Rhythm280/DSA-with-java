package conditional;

import java.util.Scanner;

public class calculate_depreciation_of_value {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double cost = obj.nextDouble();
        double salvageValue = obj.nextDouble();
        double usefullLife = obj.nextDouble();
        double annualDepreciation = (cost - salvageValue) / usefullLife;
        System.out.println(annualDepreciation);
        obj.close();
    }
}
