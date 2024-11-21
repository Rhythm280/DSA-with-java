package java_program;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String fruit = obj.next();
        switch (fruit) {
            case "mango":
                System.out.println("King of Fruits");
                break;
            case "orange":
                System.out.println("Round Fruit");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "grapes":
                System.out.println("Small Fruit");
            default:
                System.out.println("enter the name of fruit");
        }
        int day = obj.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

        // nested switch
        int emp_id = obj.nextInt();
        String department = obj.next();
        switch (emp_id) {
            case 1:
                System.out.println("Raj");
                break;
            case 2:
                System.out.println("Kamal");
                break;
            case 3:
                System.out.println("Raman");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department Found");
                }
                break;
            default:
                System.out.println("No emplow found");
        }
        obj.close();
    }
}
