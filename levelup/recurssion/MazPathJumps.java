package levelup.recurssion;
import java.util.*;
public class MazPathJumps {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] dir = {{0,1},{1,0},{1,1}};
        String[] dirs = {"h","v","d"};
        ArrayList<String> res = getMazePaths(0,0,n-1,m-1,dir,dirs);
        System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc,int[][] dir, String[] dirs) {
        ArrayList<String> paths = new ArrayList<String>();
        if(sr == dr && sc == dc){
            paths.add("");
            return paths;
        }

        for(int i=0;i<dirs.length;i++){
            for(int rad = 1 ; rad<= Math.max(dr,dc);rad++)
            {int r = sr + rad * dir[i][0];
            int c = sc + rad * dir[i][1];
            if(r >=0 && c >=0 && r <=dr && c <=dc )
                {
                    ArrayList<String> res = getMazePaths(r,c,dr,dc,dir,dirs);
                    for(String path : res){
                        path = dirs[i] +rad+ path ;
                        paths.add(path);
                    }
                }
            }
        }
        return paths;
    }
}
