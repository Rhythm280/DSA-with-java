package search.questions;

public class position_of_element_in_infinity_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 10, 90, 100, 130, 140, 160, 170, 180, 200, 213, 245, 301, 350, 410};
        int targer = 101;
        System.out.println(findAns(arr, targer));
    }

    static int findAns(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binary_search(arr, target, start, end);
    }

    static int binary_search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
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
        return -1;
    }
}
