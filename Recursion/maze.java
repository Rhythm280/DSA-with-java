package Recursion;

import java.util.ArrayList;

public class maze {

    public static void main(String[] args) {
        System.out.println(mazeCount(3, 3));
        mazePath("", 3, 3);
        System.out.println(mazePathList("", 3, 3));
        System.out.println(mazePathDiagnoal("", 3, 3));

        Boolean[][] maze = {
            {true, true, true},
            {true, false, false},
            {true, true, true},};
        mazePathObsticals(maze, "", 0, 0);
    }

    // number of possible ways to solve the maze
    public static int mazeCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int ans = mazeCount(r - 1, c) + mazeCount(r, c - 1);;
        return ans;
    }

    //print the paths to solve the maze
    public static void mazePath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            mazePath(p + 'D', r - 1, c);
        }
        if (c > 1) {
            mazePath(p + 'R', r, c - 1);
        }
    }

    // return the path in arrayList
    public static ArrayList<String> mazePathList(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(mazePathList(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(mazePathList(p + 'R', r, c - 1));
        }
        return list;
    }

    // what if we can go diagnoal
    public static ArrayList<String> mazePathDiagnoal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(mazePathDiagnoal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            list.addAll(mazePathDiagnoal(p + 'H', r, c - 1));
        }
        if (c > 1 && r > 1) {
            list.addAll(mazePathDiagnoal(p + 'D', r - 1, c - 1));
        }
        return list;
    }

    // maze with obsticals
    public static void mazePathObsticals(Boolean[][] maze, String p, int r, int c) {
        if (r == maze.length - 1 && c == maze[r].length - 1) {
            System.out.println(p);
            return;
        }
        // if(!maze[r][c]) {
        //     return;
        // }
        if (r < maze.length - 1 && maze[r][c] == true) {
            mazePathObsticals(maze, p + 'D', r + 1, c);
        }
        if (c < maze[r].length - 1 && maze[r][c] == true) {
            mazePathObsticals(maze, p + 'R', r, c + 1);
        }
    }
}
