// cyclic array in this case

/* Example 1:
Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 

The second 1's next greater number needs to search circularly, which is also 2.
Example 2:
Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
 */ 

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        int[] output = new int[n];

        Stack<Integer> stack = new Stack();

        Arrays.fill(output, -1);

        for(int i=0; i< n * 2; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[ i% n] ) {
               output[stack.pop()] = nums[i % n];
            }
            if(i < n) stack.push(i);
        }

        return output;    
        
        }
}
