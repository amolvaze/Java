// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

// Return true if and only if the given array A is monotonic.
    
// Example 1:

// Input: [6,5,4,4]
// Output: true

// Example 2:
// Input: [1,3,2]
// Output: false

// Time Complexity - O(n)

//Space Complexity - O(1)

class Solution {
    public boolean isMonotonic(int[] A) {
        
        boolean increasing = true;
        boolean decreasing = true;
        
        for(int i=0; i< A.length-1; i++){
          if(A[i] > A[i+1]) increasing = false;
          if(A[i] < A[i+1]) decreasing = false;
        }
        
        return increasing || decreasing;
    }
}
