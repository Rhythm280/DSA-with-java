package Sorting;

import java.util.Arrays;

public class Selectrd_sorting {
    public static void main(String[] args) {
        int[] arr = { -2, -14, -34, 123, 543, 21 };
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int max = max(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static int max(int[] arr, int start, int last) {
        int max = start;
        for (int i = 0; i < arr.length; i++) {
            if (arr[max] > arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
