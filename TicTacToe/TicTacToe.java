import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        while(!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] == ' ') {
                // place the element
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver) {
                    System.out.println("Player " + player + " has won:");
                } else {
                    if(player == 'X') {
                        player = '0';
                    } else {
                        player = 'X';
                    }
                }
            } else {
                System.out.println("Invalid move. try again");
            }
        }
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean haveWon(char[][] board, char player) {
        // check the rows
        for(int i = 0; i < board.length; i++) {
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        for(int i = 0; i < board.length; i++) {
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // diagnol
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}
