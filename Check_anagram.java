// // Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

import java.util.HashMap;
public class Check_anagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())  {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
          
          char[] sAr = s.toCharArray();
          char[] tAr = t.toCharArray();
          
          for(int i=0;i<sAr.length;i++){
              Integer val = map.get(sAr[i]);
              if(val != null){
                map.put(sAr[i],++val);
              }
              else{
                  map.put(sAr[i],1);
              }
          }
          
          for(int i=0;i<tAr.length;i++){
              Integer val = map.get(tAr[i]);
              if(val != null && val > 0){
                map.put(tAr[i], --val);
              }else{
                  return false;
              }
          }
           return true;
      }
    public static void main(String[] args) {
        boolean res = isAnagram("rat","car");
        System.out.println(res);
    }
}
