package Recursion;

public class array_is_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 6};
        System.out.println(sorted(arr, 0));;
    }

    public static boolean sorted(int[] arr, int i) {
        if(i == arr.length - 1){
            return true;
        }
        return arr[i] < arr[i + 1] && sorted(arr, i + 1);
    }
}
