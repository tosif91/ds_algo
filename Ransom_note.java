// Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

 

// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true
 

// Constraints:

// 1 <= ransomNote.length, magazine.length <= 105
// ransomNote and magazine consist of lowercase English letters.
public class Ransom_note {
    
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magArr = magazine.toCharArray();
        char[] ranArr = ransomNote.toCharArray();
        
        int[] freq = new int[26];
        
        for(int i=0;i<magArr.length;i++){
            freq[magArr[i] - 'a']++;
        }
        
        for(int j = 0;j<ranArr.length;j++){
            int pos = ranArr[j] - 'a';
            if(freq[pos] > 0){
                freq[pos]--;
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }
}
