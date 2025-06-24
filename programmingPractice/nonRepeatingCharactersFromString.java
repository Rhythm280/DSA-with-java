package programmingPractice;

// import java.util.LinkedHashMap;
// import java.util.Map;

public class nonRepeatingCharactersFromString {
    public static void main(String[] args) {
        String str = "aabbccdder";
        System.out.println(nonRepeatingChar(str));
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                System.out.println(ch + ": " + freq[ch]);
            }
        }
    }

    public static char nonRepeatingChar(String str) {
        // if(str == null || str.isEmpty()) {
        // return null;
        // }
        // Map<Character, Integer> charCount = new LinkedHashMap<>();
        // for(int i = 0; i < str.length(); i++) {
        // charCount.put(str.charAt(i), charCount.getOrDefault(str.charAt(i), 0) + 1);
        // }

        // for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
        // if(entry.getValue() == 1) {
        // return entry.getKey();
        // }
        // }
        // return null;
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                freq[ch - 'a']++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }
        return '0';
    }
}
