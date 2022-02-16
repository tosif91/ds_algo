public class Move_zeroes {
    public static void moveZeroes(int[] nums) {
     int idx = 0;
     for(int num : nums){
         if(num !=0){
             nums[idx++] = num;
         }
     }

     while(idx < nums.length){
        nums[idx++] = 0;
     }
    }

    public static void main(String[] args) {
        int[] input = new int[] { 0, 1, 0, 3, 12 };

        moveZeroes(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}