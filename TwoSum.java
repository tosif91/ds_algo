// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// For Sorted ARRAY
// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.

//Solution 
public class TwoSum {

   public static  int[] twoSum(int[] nums, int target) {
         
         int lp = 0;
         int rp = nums.length - 1;

         while(lp < rp){
             int sum = nums[lp] + nums[rp];
             if(sum == target){
                 return new int[]{lp,rp};
             }
             else if (sum < target){
                 lp++;
             }
             else if (sum > target){
                 rp--;
             }
         }
         return new int[0];
    }

    public static void main(String[] args) {
        int[] input = new  int[]{2,7,11,15};
        int[] res = twoSum(input,6);
   for(int i =0;i<res.length;i++){
       System.out.println(res[i]);
   }


    }
}