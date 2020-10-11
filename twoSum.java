import java.util.*;

// code for Two Sum using a hashmap in lienar time O(n) and space O(n)

// This solution when input is unsorted.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // loop thru given input array
        for(int i=0; i< nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
              result[0] = map.get(diff);
              result[1] = i;
            }
            else {
               map.put(nums[i], i);
            }
        }
      
        return result;
        
    }
}
// ------------------------------------------------When input is sorted, below is the solution------------------------------------------

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left =0, right = numbers.length-1;
        while(left < right){
            int l = numbers[left];
            int r = numbers[right];
            if(l+r == target){
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
            else if(l+r < target){
                left++;
            }
            else{
                right--;
            }
         }
        
        return result;
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)
