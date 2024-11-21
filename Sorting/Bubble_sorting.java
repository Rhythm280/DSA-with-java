package Sorting;

import java.util.Arrays;

public class Bubble_sorting {
    public static void main(String[] args) {
        int[] arr = { -2, -14, -34, 123, 543, 21 };
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
