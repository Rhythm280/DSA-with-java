package conditional;

import java.util.Scanner;

public class calculate_CGPA {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int totalSubject = obj.nextInt();
        double totalPoints = 0;
        for(int i = 1; i <= totalSubject; i++) {
            double gradePoints = obj.nextDouble();
            totalPoints += gradePoints;
        }
        double cgpa = totalPoints / totalSubject;
        System.out.println(cgpa);
        obj.close();
    }
}