// Code develped by Amol Vaze

import java.util.*;

// code to remove duplicates from a given sorted array.

class Main {
  public static void removeDuplicates(int[] nums) {
        if (nums.length == 0) {
        System.out.println("Input array is empty:- ");
        return;
        }
        
        Set<Integer> numset = new HashSet<>();
        for(int i:nums){
            numset.add(i);
        }
        //return numset.size();
    for(int result : numset){
   System.out.println(result);
}
    }
   
   // another approach without using hashset in O(n) time.
   //public static int removeDuplicates(int[] nums) {
    //if (nums.length == 0) return 0;
    //int i = 0;
    //for (int j = 1; j < nums.length; j++) {
        //if (nums[j] != nums[i]) {
           // i++;
            //nums[i] = nums[j];
        //}
   // }
    //return i + 1;
//}
    
  public static void main(String[] args) {
    int[] arr ={1,1,3,5,6,6,8,8,8,67,566};
    removeDuplicates(arr);
  }
}
