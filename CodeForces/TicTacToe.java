import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int xCount = 0, oCount = 0;

        for(int i = 0; i < 3; i++) {
            String line = sc.next();
            for(int j = 0; j < 3; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'X') xCount++;
                else if (board[i][j] == '0') oCount++;
            }
        }

        boolean xWins = hasWon(board, 'X');
        boolean oWins = hasWon(board, '0');

        // Rule: invalid move count
        if (oCount > xCount || xCount - oCount > 1) {
            System.out.println("illegal");
            return;
        }

        // Rule: both can't win
        if (xWins && oWins) {
            System.out.println("illegal");
            return;
        }

        // Rule: win must match move counts
        if (xWins && xCount != oCount + 1) {
            System.out.println("illegal");
            return;
        }

        if (oWins && xCount != oCount) {
            System.out.println("illegal");
            return;
        }

        if (xWins) {
            System.out.println("the first player won");
        } else if (oWins) {
            System.out.println("the second player won");
        } else if (xCount + oCount == 9) {
            System.out.println("draw");
        } else {
            // If game is still going, check whose turn
            System.out.println(xCount == oCount ? "first" : "second");
        }
    }

    public static boolean hasWon(char[][] board, char player) {
        // Rows
        for(int i = 0; i < 3; i++)
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;

        // Columns
        for(int i = 0; i < 3; i++)
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;

        // Diagonals
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;

        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
}
