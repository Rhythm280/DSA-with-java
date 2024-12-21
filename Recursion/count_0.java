package Recursion;
public class count_0{
	public static void main(String[] args) {
		System.out.println(counter(100021, 0));
	}
	public static int counter(int n, int count) {
		if(n % 10 == n) {
			return count;
		}
		int rem = n % 10;
		if(rem == 0) {
			return counter(n / 10, count + 1);
		}
		return counter(n / 10, count);
	}
}