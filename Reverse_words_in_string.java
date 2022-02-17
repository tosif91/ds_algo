 

public class Reverse_words_in_string {
    public static  String reverseWords(String s) {
        char[] ar = s.toCharArray();
        
        int start = 0;
        for(int end = 0;end < ar.length;end++) {
            if(ar[end] == ' '){
                reverse(ar, start, end-1);
                start = end+1;
                
            }else{
                end++;
            }
        }
        return new String(ar);
    }
    
    public static void reverse(char[] str , int lp ,int rp) {
        while(lp < rp) {
            char temp = str[lp];
            str[lp] = str[rp];
            str[rp] = temp;
        }
    }
    
    public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);    
    // String s = scanner.next();
    String res = reverseWords("Let's take LeetCode contest");
    System.out.println(res);
    }
}
