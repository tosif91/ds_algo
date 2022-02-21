package sliding_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Longest_Substring_Without_Repeating_Characters {

    public static int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        String bckup = "";
        int max = 0;
        for(int i=0;i<c.length;i++){
            char temp = c[i];
            bckup+=temp;
            Integer val = map.get(temp);
            System.out.println(val);
            if(val != null){
                map.put(temp,i);
                String ss = bckup.substring(val+1);
                System.out.println(bckup+"->"+ss);
                if(ss.length() > max){
                    max = ss.length();
                }
            }else{
                map.put(temp,i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int res = lengthOfLongestSubstring("pewuwkew");
        System.out.println(res);
    }


    // public int lengthOfLongestSubstring(String s) {
    //     char[] ar = s.toCharArray();
    //     int max = 0;
    //     String ss = "";
    //     LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    //     for (int i = 0; i < ar.length; i++) {

    //         Integer idx = map.get(ar[i]);
    //         map.put(ar[i], ss.length());
    //         ss += ar[i];
    //         if (idx != null) {
    //             ss = ss.substring(idx + 1);
    //             // map.
    //         }

    //         if (max < ss.length())
    //             max = ss.length();

    //     }
    //     return max;
    // }

    // public boolean checkInclusion(String s1, String s2) {
    //     char[] c1 = s1.toCharArray();
    //     char[] c2 = s2.toCharArray();

    //     HashSet<Character> set = new HashSet<Character>();

    //     for (int i = 0; i < c1.length; i++) {
    //         set.add(c1[i]);
    //     }

    //     for (int i = 0; i < c2.length; i++) {
    //         if (set.contains(c2[i])) {
    //             set.remove(c2[i]);
    //         } else {
    //             if (set.size() != c1.length) {
    //                 set.clear();
    //                 for (int j = 0; j < c2.length; j++) {
    //                     set.add(c2[j]);
    //                 }
    //             }
    //         }
    //         if (set.isEmpty()) {
    //             return true;
    //         }
    //     }

    //     return false;
    // }
}
