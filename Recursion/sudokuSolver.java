package Recursion;

public class sudokuSolver {

    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solve(board)) {
            display(board);
        } else {
            System.out.println("can't be solved");
        }
    }

    public static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        // this is how we are replaceing the r, c from the arguments.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // check for an empyth place
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if we an empty element in the row then break it.
            if (emptyLeft == false) {
                // found the empty element;
                break;
            }
        }

        if (emptyLeft) {
            // not empty element is found, sudoku is solved.
            return true;
        }
        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer.
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        // if can't find any suitable answer.
        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int number) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check is the number is already in the row or not if yes then return false.
            if (board[row][i] == number) {
                return false;
            }
        }

        // check the column
        for (int[] nums : board) {
            // check if the number is available in the column or not if yes then return false.
            if (nums[col] == number) {
                return false;
            }
        }

        // chaeck the 3x3 grid
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c > colStart + sqrt; c++) {
                if (board[r][c] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
