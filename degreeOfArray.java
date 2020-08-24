import java.util.*;

// code to return degree of an array.

/*
Time Complexity: O(N)O(N), where NN is the length of nums. Every loop is through O(N)O(N) items with O(1)O(1) work inside the for-block.

Space Complexity: O(N)O(N), the space used by left, right, and count.
 */
class Main {
     public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap();
        int degree=0;
        int min_length=0;
        HashMap<Integer, Integer> first_seen = new HashMap(); 
        for(int i=0; i< nums.length; i++)
        {
          first_seen.putIfAbsent(nums[i], i);
          counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
          if(counts.get(nums[i]) > degree)
          {
              degree = counts.get(nums[i]);
              min_length = i-first_seen.get(nums[i]) + 1;
          }
          else if(counts.get(nums[i]) == degree)
          {
              min_length = Math.min(min_length, i-first_seen.get(nums[i]) + 1 );
          }
            
        }
        
    return min_length;  
        
    }

  public static void main(String[] args) {
    int[] arr = {1,2,2,3,1};
    System.out.println(findShortestSubArray(arr));
  }
}
