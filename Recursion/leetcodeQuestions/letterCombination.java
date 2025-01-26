package Recursion.leetcodeQuestions;

import java.util.ArrayList;

public class letterCombination {

    public static void main(String[] args) {
        letterCombinations("", "13");
        System.out.println(letterCombinationsArrayList("", "13"));
        System.out.println(letterCombinationsCount("", "13"));
    }

    // normal implementation
    public static void letterCombinations(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0';  // this will convert '2' into 2.
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            letterCombinations(p + ch, up.substring(1));
        }
    }

    // ArrayList implementation
    public static ArrayList<String> letterCombinationsArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';  // this will convert '2' into 2.

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(letterCombinationsArrayList(p + ch, up.substring(1)));
        }
        return ans;
    }

    // return the count
    public static int letterCombinationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';  // this will convert '2' into 2.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count += letterCombinationsCount(p + ch, up.substring(1));
        }
        return count;
    }
}
