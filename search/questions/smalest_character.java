package search.questions;

public class smalest_character {
    public static void main(String[] args) {
        char[] arr = {'b','d', 'f', 'j', 'h', 'l', 'p', 'r'};
        char target = 'r';
        System.out.println(smallest_letter(arr, target));
    }

    static char smallest_letter(char[] arr, char target){


        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] <= target){
                start = mid + 1;
            }
        }
        return arr[start % (arr.length)];
    }
}
