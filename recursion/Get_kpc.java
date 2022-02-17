// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map :
//     0 -> .;
//     1 -> abc
//     2 -> def
//     3 -> ghi
//     4 -> jkl
//     5 -> mno
//     6 -> pqrs
//     7 -> tu
//     8 -> vwx
//     9 -> yz
// 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.                 

// Constraints
// 0 <= str.length <= 10
// str contains numbers only

// Format
// Input
// A string str

// Output
// Contents of the arraylist containing words as shown in sample output

// Example
// Sample Input

// 78

// Sample Output
// [tv, tw, tx, uv, uw, ux]


package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_kpc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = getKPC(str);
        System.out.println(res);
    }

    static String[] keys = new String[] { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {
        ArrayList<String> res = new ArrayList<String>();
        if (str.length() == 0) {
            res.add("");
            return res;
        }

        int pos = str.charAt(0) - '0';
        str = str.substring(1);
        ArrayList<String> out = getKPC(str);
        String keyCode = keys[pos];
        for (int i = 0; i < keyCode.length(); i++) {
            for (String val : out) {
                res.add(keyCode.charAt(i) + val);
            }
        }
        return res;
    }
}
