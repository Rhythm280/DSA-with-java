import java.util.Scanner;
import java.util.regex.*;

public class Spreadsheets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-- > 0) {
            String str = sc.next();

            if(isRxCyForm(str)) {
                System.out.println(RxCyToA1(str));
            } else {
                System.out.println(A1ToRxCy(str));
            }
        }
    }

    public static boolean isRxCyForm(String str) {
        return str.matches("R\\d+C\\d+");
    }

    public static String RxCyToA1(String s) {
        Pattern pattern = Pattern.compile("R(\\d+)C(\\d+)");
        Matcher matcher = pattern.matcher(s);
        if (!matcher.matches()) return "";

        int row = Integer.parseInt(matcher.group(1));
        int col = Integer.parseInt(matcher.group(2));

        // Convert column number to letters
        StringBuilder colLetters = new StringBuilder();
        while (col > 0) {
            col--; // Decrement to handle 1-based indexing
            colLetters.insert(0, (char) ('A' + col % 26));
            col /= 26;
        }

        return colLetters.toString() + row;
    }

    public static String A1ToRxCy(String str) {
        StringBuilder row = new StringBuilder();
        StringBuilder col = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                col.append(ch);
            } else {
                row.append(ch);
            }
        }

        int rowNum = Integer.parseInt(row.toString());

        String column = col.toString();
        int colN = 0;
        for(int i = 0; i < column.length(); i++) {
            colN = colN * 26 + (column.charAt(i) - 'A' + 1);
        }
        
        return "R" + rowNum + "C" + colN;
    }
}