package programmingPractice;

public class LowerToUpper {
    public static void main(String[] args) {
        String str = "sdfggDSGGSDDdgh";
        StringBuilder ls = new StringBuilder();
        StringBuilder us = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                ch -= 32;
            }
            ls.append(ch);
            if(ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            us.append(ch);
        }
        System.out.println(ls);
        System.out.println(us);
    }
}
