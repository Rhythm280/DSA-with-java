package pattern;

public class pattern_1 {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern31(5);
    }

    static void pattern2(int n) {
        // row <= cols
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line.
            System.out.println();
        }
    }

    static void pattern1(int n) {
        // rows = cols
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int toatalcols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= toatalcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row = 0; row < n; row++){
            for(int col = row; col < n; col++){
                
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int toatalcols = row > n ? 2 * n - row : row;
            int spacing = n - toatalcols;
            for (int s = 0; s < spacing; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < toatalcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int toatalcols = row > n ? 2 * n - row : row;
            for (int space = 0; space < n - toatalcols; space++) {
                System.out.print("  ");
            }
            for (int col = toatalcols; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= toatalcols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            for (int col = 0; col <= 2 * n; col++) {
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min((2 * n) - col, (2 * n) - row));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
