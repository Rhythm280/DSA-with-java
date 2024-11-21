package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MD_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3]; // in this adding no of rows is mandatory as compare to columns because is
                                     // decides that how many no. of arrays we need to create in the Heap Memory.
        // each row of array can have various no. of columns.
        int[][] arr1 = {
                { 1, 2, 3, 2341, 2, 514, 5, 4, 26, 262 },
                { 4, 5, 6, 3, 235, 4424, 141, 14 },
                { 7, 8, 9, 145, 34, 546, 2, 62 }
        };

        // user input using for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the " + (i + 1) + " " + (j + 1) + " " + " number:");
                arr[i][j] = in.nextInt();
            }
        }

        // print output using toString() method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr1[i]));
        }
        System.out.println();

        // print using for-each loop
        for (int i[] : arr) {
            System.out.print(Arrays.toString(i));
        }
        in.close();

    }
}