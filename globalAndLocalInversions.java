// Linear time O(n) solution

// We have some permutation A of [0, 1, ..., N - 1], where N is the length of A.

// The number of (global) inversions is the number of i < j with 0 <= i < j < N and A[i] > A[j].

// The number of local inversions is the number of i with 0 <= i < N and A[i] > A[i+1].

// Return true if and only if the number of global inversions is equal to the number of local inversions.

// All local inversions are global inversions but all global inversions are not local inversions.  Thus we are returning true if we get thru everything.

// Example 1:

// Input: A = [1,0,2]
// Output: true
// Explanation: There is 1 global inversion, and 1 local inversion.
// Example 2:

// Input: A = [1,2,0]
// Output: false
// Explanation: There are 2 global inversions, and 1 local inversion.

class Solution {
    public boolean isIdealPermutation(int[] A) {
        int max =-1;
        for(int i=0; i< A.length-2; i++){
          max = Math.max(max, A[i]);
         if(max > A[i+2]){
             return false;
         }
        }
        
        return true;
    }
}

// ----------------------------------JavaScript same above solution--------------------------------------------------------

var isIdealPermutation = function(A) {
    let max = -1;
    for(let i=0; i< A.length-2; i++){
       max = Math.max(max, A[i]);
        if(max > A[i+2]) return false;
    }
    
    return true;
};
