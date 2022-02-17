package recursion;

import java.util.ArrayList;
import java.util.Scanner;

// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 0 <= n <= 10

// Format
// Input
// A number n

// Output
// Contents of the arraylist containing paths as shown in sample output

// Example
// Sample Input

// 3

// Sample Output
// [111, 12, 21, 3]

public class Get_stairpath {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        ArrayList<String> res = getStairPaths(3);
        System.out.println(res);
    }

    public static ArrayList<String> getStairPaths(int n) {
        ArrayList<String> res = new ArrayList<String>();
        if (n == 0) {
            res.add("");
            return res;
        }else if(n < 0){
            return res;
        }
        ArrayList<String> path1 = getStairPaths(n - 1);
        
        ArrayList<String> path2 = getStairPaths(n - 2);
      
        ArrayList<String> path3 = getStairPaths(n - 3);
        
        
        for (String val : path1) {
            
            res.add(1+val);
        }
        for (String val : path2) {
            
            res.add(2+ val);
        }
        for (String val : path3) {
            
            res.add(3 +val);
        }
        return res;
    }
}
