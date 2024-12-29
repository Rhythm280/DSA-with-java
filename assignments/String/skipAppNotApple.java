package assignments.String;

public class skipAppNotApple {

    public static void main(String[] args) {
        System.out.println(skipReqStr("bacapplecda"));
    }

    public static String skipReqStr(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !(up.startsWith("apple"))) {
            return skipReqStr(up.substring(3));
        } else {
            return up.charAt(0) + skipReqStr(up.substring(1));
        }
    }
}
