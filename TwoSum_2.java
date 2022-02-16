import java.util.*;

public class TwoSum_2 {
    
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            
            if(map.containsKey(numbers[i])){
                res[0] = i;
                res[1] =map.get(numbers[i]);
            }
            map.put(target - numbers[i], i);
               
           
        }
        return res;
    }
    public static void main(String[] args) {
    
        int[] input = new int[]{2,7,2,6,11,15};
        int[] res = twoSum(input, 9);
        System.out.println(res[0]);
        System.out.println(res[1]);
        
    }
}
