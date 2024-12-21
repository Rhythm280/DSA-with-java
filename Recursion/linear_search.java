package Recursion;

public class linear_search{
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 18, 9};
		System.out.println(search(arr, 18, 0));
	}
	public static int search(int[] arr, int target, int i) {
		if(arr.length == i) {
			return -1;
		}
		if(arr[i] == target) {
			return i + 1;
		} else {
			return search(arr, target, i + 1);
		}
	}
}
