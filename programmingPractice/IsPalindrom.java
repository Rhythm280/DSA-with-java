package programmingPractice;

public class IsPalindrom {
    public static void main(String[] args) {
        numberIsPalindrom(123321);
        if (stringIsPalindrom("Hellolleh")) {
            System.out.println("string is palimdrom");
        } else {
            System.out.println("string is not palimdrom");
        }
    }

    public static void numberIsPalindrom(int num) {
        int original = num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (original == rev) {
            System.out.println(original + " is palindrom");
        } else {
            System.out.println(original + " is not palindrom");
        }
    }

    public static boolean stringIsPalindrom(String str) {
        String lowerStr = str.toLowerCase();
        int s = 0;
        int e = str.length() - 1;
        while (s < e) {
            if (lowerStr.charAt(s) != lowerStr.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
