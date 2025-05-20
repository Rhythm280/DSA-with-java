package Recursion;

public class nQueens {

    public static void main(String[] args) {
        int n = 6;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    public static int queens(boolean[][] board, int r) {
        if (r == board.length) {
            display(board);
            return 1;
        }

        int count = 0;
        // placing the queen and check for every row and column
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe.
            if (isSafe(board, r, col)) {
                board[r][col] = true;
                count += queens(board, r + 1);
                board[r][col] = false; // when we cme out of the function call change it back to normal.
            }

        }
        return count;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                // then there is a queen hence can not place the queen at board[r][col]
                return false;
            }
        }

        // check diagnal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // check diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        // its a safe position
        return true;
    }
}
