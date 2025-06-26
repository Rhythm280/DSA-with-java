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
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
        System.out.println();
        pattern15(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern31(5);
        System.out.println();
        pattern35(5);
        System.out.println();
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
        for (int row = 0; row < 2 * n; row++) {
            int toatalcols = row > n ? 2 * n - row : row;
            for (int col = 0; col < toatalcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 0; row < n; row++) {
            int spacing = n - row - 1;
            for (int s = 0; s < spacing; s++) {
                System.out.print("  ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print((row + 1) + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int toatalcols = row;
            for (int space = 0; space < n - toatalcols; space++) {
                System.out.print("  ");
            }
            for (int col = toatalcols; col >= 1; col--) {
                System.out.print("* ");
            }
            for (int col = 2; col <= toatalcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            for (int col = 2; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalcols = row > n ? 2 * n - row : row;
            for (int space = 1; space < totalcols; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - totalcols + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            if (i == n) {
                // Last row: print 2n - 1 stars
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // First star
                System.out.print("*");

                // Inner spaces (only if i > 1)
                if (i > 1) {
                    for (int j = 1; j <= 2 * i - 3; j++) {
                        System.out.print(" ");
                    }
                    // Second star
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                // First row: solid row of stars
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
            } else if (i < n) {
                // Middle rows: star, spaces, star
                System.out.print("*");
                for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                // Last row: single centered star
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }

    static void pattern15(int n) {
        // Top half (including middle line)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
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

    static void pattern31(int n) {
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min((2 * n) - col, (2 * n) - row));
                System.out.print((atEveryIndex + 1) + " ");
            }
            System.out.println();
        }
    }

    static void pattern35(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print((col + 1) + " ");
            }
            for (int space = n; space > row + 1; space--) {
                System.out.print("  ");
            }
            for (int space = n; space > row + 1; space--) {
                System.out.print("  ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print((row - col) + " ");
            }
            System.out.println();
        }
    }
}
