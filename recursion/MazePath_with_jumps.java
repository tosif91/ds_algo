package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath_with_jumps {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> res = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(res);
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

        if (sc > dc || sr > dr) {
            return paths;
        }
        for (int i = 1; i <= dc; i++) {
            ArrayList<String> hPaths = getMazePaths(sr, sc + i, dr, dc);
            for (String path : hPaths) {
                paths.add("h" + i + path);
            }
        }

        for (int j = 1; j <= dr; j++) {
            ArrayList<String> vPaths = getMazePaths(sr + j, sc, dr, dc);
            for (String path : vPaths) {
                paths.add("v" + j + path);
            }
        }

        for (int i = 1, j = 1; i <= dc && j <= dr; i++, j++) {
            ArrayList<String> hPaths = getMazePaths(sr + i, sc + j, dr, dc);
            for (String path : hPaths) {
                paths.add("d" + i + path);
            }
        }

        return paths;

    }
}
