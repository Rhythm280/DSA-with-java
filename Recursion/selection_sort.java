package Recursion;

import java.util.Arrays;

public class selection_sort {

    public static void main(String[] args) {
        int[] arr = {2, 3, 123, 1, 312, 231};
        sort(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                sort(arr, r, c + 1, c);
            } else {
                sort(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;
            sort(arr, r - 1, 0, 0);
        }
    }
}
