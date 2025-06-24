package programmingPractice;

public class IsPanagram {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopPAQqqrstuvwxyz";
        str = str.toLowerCase();
        boolean[] arr = new boolean[26];
        for(int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z')) {
                arr[ch - 'a'] = true;
            }
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(arr[i] != false) {
                count++;
            }
        }
        if(count >= 26) {
            System.out.println(str + " is panagram");
        } else {
            System.out.println(str + " is not panagram");
        }
    }
}
