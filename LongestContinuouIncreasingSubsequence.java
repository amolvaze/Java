// Time Complexity - O(N)

// Space Complexity - O(1) - constant space.

// Sliding widnow approach.

// Example 1:

// Input: nums = [1,3,5,4,7]
// Output: 3
// Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
// Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
// 4.
// Example 2:

// Input: nums = [2,2,2,2,2]
// Output: 1
// Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
// increasing.

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int result =0;
        int anchor =0; // starting boundry and achor keeps track of the start of the expanding boundry. 
        
        for(int i=0; i< nums.length; i++){
            if( i> 0 && nums[i-1] >= nums[i] ) anchor =i;
            result = Math.max(result, i-anchor + 1);
        }
        
        return result;
    }
}
