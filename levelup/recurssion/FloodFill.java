package levelup.recurssion;

import java.util.*;
public class FloodFill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dir = {{0,-1},{-1,0},{0,1},{1,0}};
        String[] dirs={"l","t","r","d"};
        floodfill(arr, 0, 0, "",dir,dirs);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,int[][] dir,String[] dirs) {
        int dr = maze.length-1;
        int dc = maze[0].length-1;
        if(sr == dr && sc == dc){
            System.out.println(asf);
            return;
        }
        maze[sr][sc] = 1;
        for(int i=0;i<dirs.length;i++){
            int r = sr + dir[i][0];
            int c = sc + dir[i][1]; 
            if(r >= 0 && c >= 0 && r <=dr && c <= dc && maze[r][c] != 1)
                floodfill(maze,r,c,asf+dirs[i],dir,dirs);
        }
        maze[sr][sc] = 0;

    }
}