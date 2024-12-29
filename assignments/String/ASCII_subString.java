package assignments.String;

import java.util.ArrayList;

public class ASCII_subString {

    public static void main(String[] args) {
        ASCIIsebSeq("", "abc");
        System.out.println(ASCIISebSeqRet("", "abc"));
    }

    public static void ASCIIsebSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        ASCIIsebSeq(ch + p, up.substring(1));
        ASCIIsebSeq(ch + p, up.substring(1));
        ASCIIsebSeq(p + (ch + 0), up.substring(1));
    }

    public static ArrayList<String> ASCIISebSeqRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = ASCIISebSeqRet(p + ch, up.substring(1));
        ArrayList<String> second = ASCIISebSeqRet(p, up.substring(1));
        ArrayList<String> third = ASCIISebSeqRet(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
