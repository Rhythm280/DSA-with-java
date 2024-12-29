package assignments.String;

import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subSeq1("", "abc"));
    }

    public static void subSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    // if we want to add it into arrayList
    public static ArrayList<String> subSeq1(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq1(p + ch, up.substring(1));
        ArrayList<String> right = subSeq1(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
