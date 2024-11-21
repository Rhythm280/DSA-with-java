package search.Linear_search;

public class MD_array_max_min {
    public static void main(String[] args) {
        int[][] arr = {
                { 123, 34, 25, 2331 },
                { 3, 21, 231, 41, 4135 },
                { 3, 124, 3 }
        };
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int max(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    static int min(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
