import java.util.*;
//Find First and Last Position of Element in Sorted Array - 

// Time complexity would be - O(log n) time using a binary search

class Main {
    
  public static void searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        for(int i=0; i< result.length; i++) {
          System.out.println(result[i]+" ");
        }
    }
    
    public static int findStartingIndex(int[] nums, int target){
        int index=-1;
         int start=0;
         int end = nums.length-1;
         while(start <= end) {
           int midpoint = start + (end-start)/2;
            
            if(nums[midpoint] >= target) {
              end = midpoint-1;
            }
             else{
                 start = midpoint+1;
             }
             
             
           if(nums[midpoint] == target) index = midpoint; 
         }
         
        return index;
    }
    
     public static int findEndingIndex(int[] nums, int target){
        int index=-1;
         int start=0;
         int end = nums.length-1;
         while(start <= end) {
           int midpoint = start + (end-start)/2;
            
            if(nums[midpoint] <= target) {
              start = midpoint+1;
            }
             else{
                 end = midpoint-1;
             }
             
             
           if(nums[midpoint] == target) index = midpoint; 
         }
         
         return index;
    }

  public static void main(String[] args) {
    int[] arr = {5,7,7,8,8,10};
    int target = 8;
    //int target = 6;
    searchRange(arr, target);

  }
}
