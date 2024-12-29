package assignments.Arrays;

import java.util.ArrayList;

public class match {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> item = [
            ["phone","blue","pixel"],
            ["computer","silver","lenovo"],
            ["phone","gold","iphone"]
            ];
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(item, ruleKey, ruleValue));
    }
    public static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int Key;
        if(ruleKey == "type") {
            Key = 0;
        } else if(ruleKey == "color") {
            Key = 1;
        } else {
            Key = 2;
        }
        for(int i = 0; i < items.size(); i++) {
            // if(i == Key) {
                for(int j = 0; j < items.get(Key).size(); j++) {
                if( items.get(Key).get(j) == ruleValue) {
                    count++;
                }
            // }
            }
        }
        return count;
    }
}
