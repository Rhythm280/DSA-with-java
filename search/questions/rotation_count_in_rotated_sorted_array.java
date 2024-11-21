package search.questions;

public class rotation_count_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(count(arr));
    }

    static int count(int[] arr){
        int pivot = pivot(arr);
        return pivot + 1;
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start > mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // if the start, mid, end are equal then ignore the dublicates
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
