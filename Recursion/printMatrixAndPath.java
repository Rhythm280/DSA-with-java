package Recursion;

import java.util.Arrays;

public class printMatrixAndPath {

    public static void main(String[] args) {
        Boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint(maze, "", 0, 0, path, 1);
    }

    public static void allPathPrint(Boolean[][] maze, String p, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[r].length - 1) {
            // this last stp will also be a step so we also need to add it
            path[r][c] = step;
            // print the path
            for(int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // in this condition this block is my path.
        maze[r][c] = false;
        // add the answer in the path
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(maze, p + 'D', r + 1, c, path, step + 1);
        }
        // for going right
        if (c < maze[0].length - 1) {
            allPathPrint(maze, p + 'R', r, c + 1, path, step + 1);
        }
        // for going up
        if (c > 0) {
            allPathPrint(maze, p + 'L', r, c - 1, path, step + 1);
        }
        // for going left
        if (r > 0) {
            allPathPrint(maze, p + 'U', r - 1, c, path, step + 1);
        }
        // this line is where the recursion call ends so, before thsi function call end also remove the changes made by this function call.
        maze[r][c] = true;
        // at the time of backtracking put the path[r][c] = 0;
        path[r][c] = 0;
    }

}
