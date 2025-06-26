package leetCode;

public class KMirror {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(kMirror(n, k));
    }

    public static long kMirror(int n, int k) {
        long sum = 0;
        for(long i = 1; n > 0; i *= 10) {
            for(long j = i; n > 0 && j < i * 10; j++) {
                long p = createPalindrome(i, true);
                if(isPalindrome(p, k)) {
                    sum += p;
                    n--;
                }
            }
            for(long j = i; n > 0 && j < i * 10; i++) {
                long p = createPalindrome(i, false);
                if (isPalindrome(p, k)) {
                    sum += p; 
                    n--;
                }
            }
        }
        return sum;
    }

    public static long createPalindrome(long num, boolean odd) {
        long x = num;
        if (odd) x /= 10;
        while (x > 0) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num;
    }

    public static boolean isPalindrome(long num, int base) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append((char) (num % base + '0'));
            num /= base;
        }
        String s = sb.toString();
        int i = 0, j = s.length() - 1;
        while (i < j) if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }
}
