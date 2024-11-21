package search.binary_search;

import java.util.Arrays;

public class sorted_matrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int target = 10;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (arr[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int cols = arr[0].length; // be cautious, array may be empty
        if (row == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }
        // run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = cols / 2;
        while (rStart < rEnd - 1) { // while this is true it will have more than two rows to eleminate
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        // now we have 2 rows
        // check wether the target is in the col of 2 rows
        if (arr[rStart][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[] { rStart, cMid + 1 };
        }

        // search in 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, rStart, 0, cMid - 1, target);
        }
        // search in 2st half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3st half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }
        // search in 4st half
        else {
            return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
