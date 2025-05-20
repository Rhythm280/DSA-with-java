import java.util.Arrays;

public class range {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = 3;
        
        // Ensure n does not exceed the array length
        n = Math.min(n, arr.length);

        // Reverse the array in parts of size 'n'
        for (int i = 0; i < arr.length; i += n) {
            reverse(arr, i, Math.min(i + n - 1, arr.length - 1));
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
