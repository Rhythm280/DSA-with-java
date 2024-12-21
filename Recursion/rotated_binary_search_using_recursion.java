package Recursion;

public class rotated_binary_search_using_recursion {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;      // found the target element
        }
        if (arr[s] <= arr[mid]) {// first half is search and we can search there
            if (target >= arr[s] && target <= arr[mid]) {
                return search(arr, target, s, mid - 1);
            } else {
                return search(arr, target, mid + 1, e);
            }
        }
        if (target >= arr[mid] && target <= arr[e]) { // answer lies in the second half search there.
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
    }
}
