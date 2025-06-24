package programmingPractice;

import java.util.Arrays;

public class MergSort {
    public static void main(String[] args) {
        int[] arr = {-12,33,54353,24324,-324324, 12, 5,432};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int s, int e) {
        if(e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, e);
        merg(arr, s, mid, e);
    }

    public static void merg(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while(i < mid && j < e) {
            if(arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, s, mix.length);
    }
}
