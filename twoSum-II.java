// Given an array of integers numbers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

// Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

// You may assume that each input would have exactly one solution and you may not use the same element twice.
// EX-1
// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

// Example 2:
// Input: numbers = [2,3,4], target = 6
// Output: [1,3]


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int a_pointer = 0;
        int b_pointer = numbers.length-1;
        
        while(a_pointer <= b_pointer){
            
            int sum = numbers[a_pointer] + numbers[b_pointer];
            
            if (sum > target){
               b_pointer -=1; 
            }else if(sum < target){
              a_pointer +=1;   
            }
            else {
                return new int[]{a_pointer+1, b_pointer+1};
            }
        }
        
        return new int[]{a_pointer+1, b_pointer+1};
    }
}
