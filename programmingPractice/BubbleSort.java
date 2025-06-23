package programmingPractice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 1212, 3, 4312, 123, 123, 3412, 41 };
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap = true;
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(!swap) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
