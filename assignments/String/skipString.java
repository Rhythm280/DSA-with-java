package assignments.String;

public class skipString {

    public static void main(String[] args) {
        System.out.println(skipString1("bacapplecda"));
    }

    public static String skipString1(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipString1(up.substring(5));
        }
        return up.charAt(0) + skipString1(up.substring(1));
    }
}
