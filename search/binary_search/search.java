package search.binary_search;

public class search {
    public static void main(String[] args) {
        int[] num = { 12, 21, 34, 40, 45, 65, 76, 78, 95, 98, 99 };
        int target = 21;
        int search = binary_search(num, target);
        System.out.println(search);
    }

    static int binary_search(int[] arr, int target) {
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
        return -1;
    }
}
