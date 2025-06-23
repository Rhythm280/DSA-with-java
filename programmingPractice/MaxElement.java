package programmingPractice;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {12,34,35,42,312,14,113};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
