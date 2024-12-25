package java_program;

import java.util.Scanner;

public class Main_7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.next();
        int s = 0;
        int e = name.length() - 1;
        boolean ispalindron = true;
        while(s < e) {
            if(name.charAt(s) != name.charAt(e)) {
                ispalindron = false;
            } else {
                ispalindron = true;
            }
            s++;
            e--;
        }
        System.out.println(ispalindron);
    }
}
