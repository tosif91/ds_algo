package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Mazepaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMazePaths(0,0,n-1,m-1);
        System.out.println(paths);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        ArrayList<String> paths = new ArrayList<String>();
        if (sr == dr && sc == dc) {
            paths.add("");
            return paths;
        }

        if (sr > dr || sc > dc) {
            return paths;
        }

        ArrayList<String> hPaths = getMazePaths(sr, sc + 1, dr, dc);

        ArrayList<String> vPaths = getMazePaths(sr + 1, sc, dr, dc);

        for (String val : hPaths) {
            paths.add('h' + val);
        }
        for (String val : vPaths) {
            paths.add('v' + val);
        }

        return paths;
    }
}
