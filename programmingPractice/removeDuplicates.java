package programmingPractice;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "aabc dd es s";
        String res = "";
        String spaceFree = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                spaceFree += str.charAt(i);
            }
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
                if(!check(res, ch)) {
                    res += ch;
                }
        }
        System.out.println(spaceFree);
        System.out.println(res);
    }

    public static boolean check(String s, char ch) {
        boolean isPresent = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch) {
                isPresent = true;
            }
        }
        return isPresent;
    }
}
