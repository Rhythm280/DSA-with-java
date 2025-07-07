import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class SnakeAndLadders {
    private static final int WIN_POSITION = 100;
    private static Map<Integer, Integer> snakes = new HashMap<>();
    private static Map<Integer, Integer> ladders = new HashMap<>();
    private static final int BOARD_SIZE = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random dice = new Random();
        snakes.put(99, 54);
        snakes.put(70, 55);
        snakes.put(52, 42);
        snakes.put(25, 2);
        snakes.put(95, 72);

        ladders.put(6, 25);
        ladders.put(11, 40);
        ladders.put(60, 85);
        ladders.put(46, 90);

        int position = 1;
        System.out.println("Welcome to Snake and Ladder");

        while(position < WIN_POSITION) {
            System.out.print("Press enter to roll the dice...");
            sc.nextLine();
            int roll = dice.nextInt(6) + 1;
            System.out.print("you roll a " + roll);

            if(position + roll <= WIN_POSITION) {
                position += roll;
                if(snakes.containsKey(position)) {
                    System.out.print("Snake bite! Down from " + position + " to " + snakes.get(position));
                    position = snakes.get(position);
                } else if(ladders.containsKey(position)) {
                    System.out.print("Ladder up! Climb from " + position + " to " + ladders.get(position));
                    position = ladders.get(position);
                }
            } else {
                    System.out.println("Can't move. You nees exactly " + (WIN_POSITION - position));
            }
            drawBoard(position);
        }
        System.out.println("Congratulations! You won");
        sc.close();
    }

    private static void drawBoard(int playerPos) {
        System.out.println("\nGame Board:");
        for (int row = BOARD_SIZE - 1; row >= 0; row--) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                int cellNumber = row % 2 == 0
                        ? (row * BOARD_SIZE + col + 1)
                        : (row * BOARD_SIZE + (BOARD_SIZE - col));

                if (cellNumber == playerPos) {
                    System.out.printf("|%3s", "P ");
                } else {
                    System.out.printf("|%3d", cellNumber);
                }
            }
            System.out.println("|");
        }
    }
}