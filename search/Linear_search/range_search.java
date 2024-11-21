package search.Linear_search;

public class range_search {
    public static void main(String[] args) {
        int[] arr = { 12, 233, 41, 41, 12, 54, 1, 4, 45123, 2344 };
        int target = 54;
        System.out.println(target + " is at " + search(arr, target, 3, 8));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i + 1;
            }
        }
        return -1;
    }
}