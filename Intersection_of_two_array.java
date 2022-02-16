// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 // Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000
 

// Follow up:

// What if the given array is already sorted? How would you optimize your algorithm?
// What if nums1's size is small compared to nums2's size? Which algorithm is better?
// What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Intersection_of_two_array{

    public static int[] intersect(int[] nums1, int[] nums2) {
    
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums1.length;i++){
            if(map.get(nums1[i]) != null){
                int val = map.get(nums1[i]);
                map.put(nums1[i], val+1);
            }else{
                map.put(nums1[i],1);
            }
        }
        ArrayList<Integer> ar = new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j])){
                int val = map.get(nums2[j]);
                if(val > 0){
                    ar.add(nums2[j]);
                    val -=1;
                    map.put(nums2[j], val);
                }
            }
        }

       int[] arr = new int[ar.size()];
       for(int i=0;i<ar.size();i++){
           arr[i] = ar.get(i);
       }

    return arr;
    }

    public static int[] intersect2ForSortedArr(int[] nums1, int[] nums2) {
    int n1=0;
    int n2=0;
    ArrayList<Integer> ar = new ArrayList<>();
    while(n1 < nums1.length || n2<nums2.length){
    int v1 =(n1 < nums1.length)? nums1[n1]:0;
    int v2 = (n2 < nums2.length)? nums2[n2]:0;

    if(v1 == v2){
        ar.add(v1);
        n1++;
        n2++;
    }
    else if(v1 < v2){
        n1++;
    }else{
        n2++;
    }

    }
    int[] arr = new int[ar.size()];
    for(int i=0;i<ar.size();i++){
        arr[i] = ar.get(i);
    }
    return arr;
    }

    public static void main(String[] args){
    int[] nums1 = new int[]{4,4,5,9,8};
    int[] nums2 = new int[]{4,5,9};

    // int[] res =   intersect(nums1,nums2);
    int[] res = intersect2ForSortedArr(nums1, nums2);
    for(int i=0;i<res.length;i++){
        System.out.println(res[i]);
    }
    
    }
}
