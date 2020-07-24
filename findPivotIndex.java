//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
//Also, 3 is the first index where this occurs.
//Example 2:

//Input: nums = [1,2,3]
//Output: -1
//Explanation:
//There is no index that satisfies the conditions in the problem statement.
 

//Constraints:

//The length of nums will be in the range [0, 10000].
//Each element nums[i] will be an integer in the range [-1000, 1000].

// O(N)

import java.util.*;

class Solution {
public static int pivotIndex(int[] nums) {
          int sum_left=0, sum_right =0;
          for(int i=0,j=0; ;j++) {
               if (j == nums.length) {
                  if (sum_left == sum_right)
                   return i;
                  else
                  {
                   sum_left = sum_right = j = 0;
                   if (++i == nums.length)
                     break;
                  }
               }
               if(j < i)
                 sum_left += nums[j];
               else if(j > i)
                 sum_right += nums[j];
           } 
           return -1;
}
  
public static void main(String[] args) {
    int[] arr = {1,7,3,6,5,6};
    System.out.println(pivotIndex(arr));
}
  
  
}
