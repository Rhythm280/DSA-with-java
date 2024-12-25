package assignments.Methods;

import java.util.Scanner;

public class displalyGrades {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int marks = obj.nextInt();
        System.out.println(grade(marks));
    }

    public static String grade(int marks) {
        if (marks > 90 && marks < 101) {
            return "AA";
        } else if (marks > 80 && marks < 91) {
            return "AB";
        } else if (marks > 70 && marks < 81) {
            return "BB";
        } else if (marks > 60 && marks < 71) {
            return "BC";
        } else if (marks > 50 && marks < 61) {
            return "CD";
        } else if (marks > 40 && marks < 51) {
            return "DD";
        }
        return "Fail";
    }
}
