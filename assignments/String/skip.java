package assignments.String;

public class skip {

    public static void main(String[] args) {
        skipChar("", "baccab");
        System.out.println(skip1("baccab"));
    }

    public static void skipChar(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skipChar(p, up.substring(1));
        }
        skipChar(p + ch, up.substring(1));
    }

    public static String skip1(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip1(up.substring(1));
        }
        return skip1(ch + up.substring(1));
    }
}
