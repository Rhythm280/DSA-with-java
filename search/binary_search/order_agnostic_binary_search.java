package search.binary_search;

public class order_agnostic_binary_search {
    public static void main(String[] args) {
        int[] num = { 1200, 210, 100, 90, 86, 75, 66, 58, 45, 38, 29 };
        int target = 29;
        int search = search(num, target, 0, num.length - 1);
        System.out.println(search);
    }

    static int search(int[] arr, int target, int start, int end) {
        boolean isass = arr[start] < arr[end];
        while (start <= end) {
            // int mid = start + end / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            }

            if (isass) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}