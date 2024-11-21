package search.questions;

public class ceiling_of_number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 43, 56, 59, 65, 73, 81, 89, 92 };
        int target = 10;
        int ceiling = ceiling(arr, target);
        System.out.println(ceiling);
    }

    static int ceiling(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = start + end / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid + 1;
            }
        }
        return arr[start]; // when the loop condition is violated (start > end) which means that targer
                           // didn't lies between the start and end is lies outsie the range which is not
                           // possible (target not found) in this case we will return the start which id
                           // the smallest number which is greater than or equal to the target.
    }
}
