package search.Linear_search;

import java.util.Arrays;

public class MD_search {
    public static void main(String[] args) {
        int[][] arr = {
                { 123, 34, 25, 2331 },
                { 3, 21, 231, 41, 4135 },
                { 2, 124, 3 }
        };
        int target = 124;
        System.out.println(target + " is at " + Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i + 1, j + 1 };
                }
            }
        }
        return new int[] { -1 };
    }
}
