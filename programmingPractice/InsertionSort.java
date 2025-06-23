package programmingPractice;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {123,12,3,43,4,35,354,6756,1};
        for(int i = 0; i< arr.length; i++) {
            for(int j = arr.length - 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
