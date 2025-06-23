package programmingPractice;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,123,12,35,43432,4};
        for(int i = arr.length - 1; i >= 0; i--) {
            int max = max(arr, 0, i);
            swap(arr, max, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int max(int[] arr, int s, int e) {
        int max = s;
        for(int i = 0; i <= e; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
