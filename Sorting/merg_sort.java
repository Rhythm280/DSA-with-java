package Sorting;

import java.util.Arrays;

public class merg_sort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 8, 1, 2, 312,13,123,123,12312,312,345,435,6546,245,31451};
        int[] answer = sort(arr);
        System.out.println(Arrays.toString(answer));
        inPointSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] rigth = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merg(left, rigth);
    }

    public static int[] merg(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for mix array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it will be possible that one of the array is mot complete then we need to add all the remaining element into the mix array.
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    // in-point merge-sort
    public static void inPointSort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        inPointSort(arr, s, mid);
        inPointSort(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }

    public static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, s, mix.length);
    }
}
