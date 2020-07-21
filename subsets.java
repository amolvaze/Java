// Input: nums = [1,2,3]
// Output:
// [
//   [3],
//   [1],
//   [2],
//   [1,2,3],
//   [1,3],
//   [2,3],
//   [1,2],
//   []
// ]

import java.util.*;
// code to return subsets of nos
class Solution {
    List<List<Integer>> result = new ArrayList();
    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length == 0) 
            return result;
        backTrack(0, new ArrayList<Integer>(), nums);
        return result;
    }
    
    public void backTrack(int start, ArrayList<Integer> curr , int[] nums) {
        result.add(new ArrayList<Integer> (curr));
        
        // loop thru 
        for(int i =start; i< nums.length; i++) {
            curr.add(nums[i]);
            backTrack(i+1, curr, nums);
            curr.remove(curr.size()- 1);
        }
        
        
    }
    
}
