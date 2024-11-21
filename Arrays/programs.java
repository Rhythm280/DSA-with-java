package Arrays;
import java.util.Arrays;

public class programs {
    public static void main(String[] args) {
        int[] arr = {123,15,15,145,7657,7345,1,5,4};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr, 0, arr.length));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int max(int[] arr, int start, int end){
        int max_num = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max_num){
                max_num = arr[i];
            }
        }
        if(end < start){
            return -1;
        }
        return max_num;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}