
import java.util.HashMap;
import java.util.LinkedHashMap;

public class First_unique_char_in_string {
    public static void main(String[] args) {

        String str = "mmleetcode";
         
        int[]  freq = new  int[26];
        char[] c = str.toCharArray();
        
        for(int i=0;i<c.length;i++){
            freq[c[i]-'a']++;
        }
        
        for(int i=0;i<c.length;i++){
            if(freq[c[i] - 'a'] == 1){
                System.out.println(i);
                break;
            }
        }
    }
}