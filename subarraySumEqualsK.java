import java.util.*;

// code to return subarray sum equals k using Hashmap in linear time - O(n) and O(1) space
//Input:nums = [1,1,1], k = 2
//Output: 2
  class Main {

   public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int count =0;
        // Loop thru given array
     for(int i=0; i< nums.length; i++)
     {
       sum += nums[i];
      if(map.containsKey(sum-k))
      {
       count += map.get(sum-k);
      }
      
       map.put(sum, map.getOrDefault(sum, 0) + 1);
     
     }

     return count; 

    }

  public static void main(String[] args) {
    int[] arr = {1,2,3};
    int k = 3;
    System.out.println(subarraySum(arr, k));
  }
}
