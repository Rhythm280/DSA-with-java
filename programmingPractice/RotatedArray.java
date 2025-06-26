package programmingPractice;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        // rotate (arr, 0, arr.length - 1);
        // rotate(arr, 0, k - 1);
        // rotate(arr, k, arr.length - 1);
        for(int i = 0; i < k; i++) {
            int l = arr[arr.length - 1];
            for(int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = l;
        }
        System.out.println(Arrays.toString(arr));
    }

    // public static void rotate(int[] arr, int s, int e) {
    //     while(s <= e) {
    //         int temp = arr[s];
    //         arr[s] = arr[e];
    //         arr[e] = temp;
    //         s++;
    //         e--;
    //     }
    // }
}
