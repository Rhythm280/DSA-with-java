package assignments.BasicJavaCode;

import java.util.Scanner;

public class noOfEventDayaInAMonth {

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int month = obj.nextInt();
            System.out.println(evenDaysInMonth(month, 0));
        }
    }

    public static int evenDaysInMonth(int month, int count) {
        if (month == 0) {
            return count;
        }

        if (month % 2 == 0) {
            return evenDaysInMonth(month - 1, count + 1);
        } else {
            return evenDaysInMonth(month - 1, count);
        }
    }
}
