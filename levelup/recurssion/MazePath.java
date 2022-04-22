package levelup.recurssion;

public class MazePath {

    public static int getMazePathCnt(int sr, int sc, int dr, int dc, int cnt) {

        if (sc == dc && sr == dr) {
            return 0;
        }

        if (sc + 1 <= dc)
            cnt += getMazePathCnt(sr, sc + 1, dr, dc, cnt); // moving horizontal
        if (sr + 1 <= dr)
            cnt += getMazePathCnt(sr + 1, sc, dr, dc, cnt); // moving vertical
        if (sc + 1 <= dc && sr + 1 <= dr)
            cnt += getMazePathCnt(sr + 1, sc + 1, dr, dc, cnt); // moving diagonal

        return cnt;
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        if (sr + 1 <= dr)
            printMazePaths(sr + 1, sc, dr, dc, psf + "V");
        if (sc + 1 <= dc)
            printMazePaths(sr, sc + 1, dr, dc, psf + "H");
        if (sr + 1 <= dr && sc + 1 <= dc)
            printMazePaths(sr + 1, sc + 1, dr, dc, psf + "D");

    }

    public static void printMazePaths2(int sr,int sc,int dr,int dc,int[][] dir,String[] dirS , String psf){
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for(int d=0;d< dir.length;d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r <=dr && c <= dc && r >=0 && c >=0 )
            printMazePaths2(r,c, dr, dc, dir, dirS, psf + dirS[d]);
        }
    }

    public static void printMazePathsJump(int sr,int sc,int dr,int dc,int[][] dir,String[] dirS,String psf){
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for(int d =0;d<dir.length;d++){
            for(int rad = 1;rad <= Math.max(dr,dc);rad++){
                int r = sr + rad*dir[d][0];
                int c = sc + rad*dir[d][1];
                
                if(r >=0 && c >=0 && r <= dr && c <= dc)
                 printMazePathsJump(r, c, dr, dc, dir, dirS, psf+dirS[d]+rad);
            }
        }
    }

    public static void main(String[] args) {
        
        // printMazePaths(0, 0, 2, 2, "");
        
        int[][] dir = {{0,1},{1,0},{1,1}};
        String[] dirS = {"H","V","D"};
        // printMazePaths2(0, 0, 2, 2, dir, dirS, "");
        printMazePathsJump(0, 0, 2, 2, dir, dirS, "");
    }
}
