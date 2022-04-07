package levelup.recurssion;

public class MazePath {
    
    public static int getMazePath(int sr,int sc, int dr,int dc,int cnt){
        
        if(sc == dc && sr == dr ){
            return 0 ;
        }

        if(sc+1 <= dc)
            cnt += getMazePath(sr, sc+1, dr, dc,cnt); // moving horizontal
        if(sr + 1 <= dr)
            cnt += getMazePath(sr+1, sc, dr, dc,cnt); // moving vertical
        if(sc+1 <=dc && sr+1 <= dr)
            cnt += getMazePath(sr+1, sc+1, dr, dc,cnt); // moving diagonal
        
        return cnt;
    }
}
