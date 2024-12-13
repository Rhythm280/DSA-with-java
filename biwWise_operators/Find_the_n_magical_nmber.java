package biwWise_operators;

public class Find_the_n_magical_nmber {
    public static void main(String[] args) {
		int n = 10;
		int base = 5;
        int ans = 0;
		while (n > 0){
			int last = n & 1;
			n = n >> 1;
			base = base * 5;
			ans = ans + last * base;
		}
		System.out.println(ans);
	}
	// In this program, the loop will run the number of times there bits in the n.
}
