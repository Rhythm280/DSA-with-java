package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntex: data_type [] variable_name = new data_type[size_of_array]
        int[] arr = new int[5]; // create the object in heap mwmory at the run time (dynamic memory allocation).
        int[] arr1 = { 1, 2, 3, 4, 5 };

        // index of array:
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        // user input for array using loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " number:");
            arr[i] = in.nextInt();
        }

        // print array using for-each loop:
        for (int i : arr) { // for every element in array, here "i" represents elements of the "arr".
            System.out.print(i + " ");
        }
        // print the whole array at once
        System.out.println(Arrays.toString(arr));

        in.close();
    }

}
