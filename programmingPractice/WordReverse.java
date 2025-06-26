package programmingPractice;

public class WordReverse {
    public static void main(String[] args) {
        String str = "Hello  Java I am Joy";
        String rev = "";
        String word = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                word += ch;
            } else {
                rev = word + " " + rev;
                word = "";
            }
        }
        rev = word + " " + rev;
        System.out.println(rev);
    }
}
