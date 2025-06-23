package programmingPractice;

public class LinerarSearch {
    public static void main(String[] args) {
        int[] arr = {123,12,3,4355,65};
        int target = 3;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println(target+ " found at " + (i + 1));
                break;
            }
        }
    }
}
