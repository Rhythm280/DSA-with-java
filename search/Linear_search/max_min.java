package search.Linear_search;

public class max_min {
    public static void main(String[] args) {
        int[] arr = { 31, 313, 413, 56, 10, 95, 63143, 30, 41 };
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
