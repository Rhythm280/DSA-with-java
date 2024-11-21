package search.Linear_search;

public class search {
    public static void main(String[] args) {
        int[] num = { 312, 123, 4, 141, 41, 24, 12, 1, 2123, 14, 1 };
        int target = 12;
        int search = linear_search(num, target);
        System.out.println(search);
    }

    static int linear_search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i + 1;
            }
        }
        return -1;
    }
}