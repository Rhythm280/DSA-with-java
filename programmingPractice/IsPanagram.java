package programmingPractice;

public class IsPanagram {
    public static void main(String[] args) {
        String str = "abcdefghijklmnPKGHqrstuvwxyz";
        int[] arr = new int[256];
        for(int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            arr[ch]++;
        }
        int count = 0;
        for(int i = 0; i < 256; i++) {
            if(arr[i] != 0) {
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
