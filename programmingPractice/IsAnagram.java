package programmingPractice;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String str1 = "L isten";
        String str2 = "Si lent";
        System.out.print(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        // remove the space and convert the uppercase into lowercase.
        str1 = str1.replace("//s", "").toLowerCase();
        str2 = str2.replace("//s", "").toLowerCase();
        if(str1.length() != str2.length()) {
            return false;
        }
        int[] freq = new int[256];
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch]++;
        }
        for(int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq[ch]--;
        }
        for(int i = 0; i < 256; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
