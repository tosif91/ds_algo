// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
// Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 0 <= str.length <= 20

// Format
// Input
// A string str

// Output
// Contents of the arraylist containing subsequences as shown in sample output

// Example
// Sample Input

// abc

// Sample Output
// [, c, b, bc, a, ac, ab, abc]

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
