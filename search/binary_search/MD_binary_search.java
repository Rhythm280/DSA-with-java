package search.binary_search;

import java.util.Arrays;

public class MD_binary_search {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 11, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 56 }
        };
        int target = 56;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row + 1, col + 1 };
            }
            if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] { -1, -1 };
    }
}
