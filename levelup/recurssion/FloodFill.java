package levelup.recurssion;

import java.util.*;

public class FloodFill {

    public static void main(String[] args) {
        int[][] maze = {
                { 0, 0, 1, 0 },
                { 1, 0, 0, 1 },
                { 0, 0, 1, 0 },
                { 0, 1, 1, 0 }
        };
        int[][] dir = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 }, { -1, -1 }, { 1, 1 } };
        String[] dirs = { "l", "t", "r", "d", "uD", "dD" };
        floodfillWithJumps(maze, 0, 0, dir, dirs, "");
    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, int[][] dir, String[] dirS, String psf) {
        int dr = maze.length - 1;
        int dc = maze[0].length - 1;

        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        maze[sr][sc] = 1;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if (r >= 0 && c >= 0 && r <= dr && c <= dc && maze[r][c] != 1)
                floodfill(maze, r, c, dir, dirS, psf + dirS[d]);
        }
        maze[sr][sc] = 0;

    }

    public static void floodfillWithJumps(int[][] maze, int sr, int sc, int[][] dir, String[] dirS, String psf) {
        int dr = maze.length - 1;
        int dc = maze[0].length - 1;
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        maze[sr][sc] = 1;
        for (int d = 0; d < dir.length; d++) {
            for (int rad = 1; rad < Math.max(dr, dc); rad++) {
                int r = sr + rad * dir[d][0];
                int c = sc + rad * dir[d][1];
                if (r >= 0 && c >= 0 && r <= dr && c <= dc && maze[r][c] != 1)
                    floodfillWithJumps(maze, r, c, dir, dirS, psf + dirS[d]);
            }
        }
        maze[sr][sc] = 0;
    }
}