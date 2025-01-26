package assignments.Arrays;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(spiral(arr));
    }

    public static List<Integer> spiral(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
