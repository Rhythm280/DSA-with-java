package placement_training;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][];
        arr[0] = new int[] {1 , 2, 3 , 4};
        arr[1] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        arr[2] = new int[] { 1, 2 , 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum = sum + arr[i][j];
            }
            System.out.println("sum of row " + (i + 1) + ": " + sum);
        }
        obj.close();
    }
}
