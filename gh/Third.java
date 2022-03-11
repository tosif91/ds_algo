package gh;

import java.util.ArrayList;

public class Third {
    public static void main(String[] args) {
        String s = "aa,cc,bb";
        ArrayList<String> res =  gss(s);
        System.out.println(res);
    }

   public static  ArrayList<String> gss(String st) {
        ArrayList<String> ar = new ArrayList<String>();
        if (st.length() == 0) {
            ar.add("");
            return ar;
        }

        int li = st.indexOf(",");
        String s = st.substring(0,li);
        st = st.substring(li);
        ArrayList<String> rss = gss(st);
        ArrayList<String> mres = new ArrayList<String>();
        for(String str : rss) {
            mres.add(str);
        }
        for(String str : mres) {
            mres.add(s + str);
        }
        return mres;
    }
}
