// Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].

// After this process, we have some array B.

// Return the smallest possible difference between the maximum value of B and the minimum value of B.

// Example 1:

// Input: A = [1], K = 0
// Output: 0
// Explanation: B = [1]
// Example 2:

// Input: A = [0,10], K = 2
// Output: 6
// Explanation: B = [2,8]


class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min_val = A[0];
        int max_val = A[0];
        
        for(int i=0 ; i < A.length; i++){
            min_val = Math.min(min_val, A[i]);
            max_val = Math.max(max_val, A[i]);
        }
        
        if(min_val + K >= max_val-K ){
            return 0;
        }
        else {
            return (max_val-K) -(min_val + K);
        }
    }
}
