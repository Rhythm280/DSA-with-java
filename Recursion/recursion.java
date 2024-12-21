package Recursion;

import java.util.Arrays;

public class recursion {
    // Binary search using recursion.
    public static void main(String[] args) {
        int[] arr = {51, 312, 3, 14, 1};
        Arrays.sort(arr); // Sort the array
        int target = 312;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1; // Return -1 if the target is not found
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return search(arr, target, s, mid - 1);
        } else { // Important: use else to avoid issues if target > arr[mid]
            return search(arr, target, mid + 1, e);
        }
    }
}