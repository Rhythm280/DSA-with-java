package Sorting;

import java.util.Arrays;

public class insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { -2, 0, 0, -14, -34, 123, 543, 21 };
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
