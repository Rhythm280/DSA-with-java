package conditional;

import java.util.Scanner;

public class reverse_a_string {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = obj.nextLine();


        // Using StringBuilder
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        System.out.println("Reversed string: " + reversedStr);

        // Using for loop
        String reversedStr2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr2 += str.charAt(i);
        }
        System.out.println("Reversed string (for loop): " + reversedStr2);
    }
}