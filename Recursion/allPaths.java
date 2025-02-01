package Recursion;

public class allPaths {

    public static void main(String[] args) {
        Boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true},};
        allPath(maze, "", 0, 0);
    }

    // this solution will show stack overflow
    public static void allPath(Boolean[][] maze, String p, int r, int c) {
        if (r == maze.length - 1 && c == maze[r].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // in this condition this block is my path.
        maze[r][c] = false;
        if (r < maze.length - 1) {
            allPath(maze, p + 'D', r + 1, c);
        }
        // for going right
        if (c < maze[0].length - 1) {
            allPath(maze, p + 'R', r, c + 1);
        }
        // for going up
        if (c > 0) {
            allPath(maze, p + 'L', r, c - 1);
        }
        // for going left
        if (r > 0) {
            allPath(maze, p + 'U', r - 1, c);
        }
        // this line is where the recursion call ends so, before thsi function call end also remove the changes made by this function call.
        maze[r][c] = true;
    }
}
