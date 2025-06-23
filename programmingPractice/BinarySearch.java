package programmingPractice;

public class BinarySearch {
    public static void main(String[] srgs) {
        int[] arr = {1,2,3,4,45,212};
        int target = 45;
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                System.out.println(target + " found at " + mid);
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
