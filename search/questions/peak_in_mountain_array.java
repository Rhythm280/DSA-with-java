package search.questions;

public class peak_in_mountain_array {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 13, 8, 4, 3, 0 };
        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // in this the loop will break when the value of start == end, and our answer
            // can be atart and end because they both will point to wards the answer value.
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // if the arr[mid] > arr[mid + 1] then we are at the assending part of the array
                // and our answer can be mid or it can lie behind the mid => end = mid (because
                // we will check left hand side array)
                end = mid;
            } else {
                // if the arr[mid] < arr[mid + 1] then we are at the descending part of the
                // array and our answer lie after the mid => start = mid + 1 (because we will
                // check right hand side of array)
                start = mid + 1;
            }
        }
        return start + 1; // we can return end + 1
    }
}
