package programmingPractice;

public class stringReverse {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder revStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            revStr.append(s.charAt(s.length() - i - 1));
        }
        System.out.println(revStr);
    }
}
