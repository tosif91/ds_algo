package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class String_sub_sequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> res = gss(s);
        for (String val : res) {
            System.out.println(val);
        }
    }

    public static ArrayList<String> gss(String str) {
        ArrayList<String> res = new ArrayList<String>();
        if (str.length() == 0) {
            res.add("");
            return res;
        }
        char c = str.charAt(0);
        str = str.substring(1);
        ArrayList<String> out = gss(str);
        for (String val : out) {
            res.add(val);
        }
        for (String val : out) {
            val = c + val;
            res.add(val);
        }
        return res;
    }
}
