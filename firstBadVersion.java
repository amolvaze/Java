// Input: n = 5, bad = 4
// Output: 4
// Explanation:
// call isBadVersion(3) -> false
// call isBadVersion(5) -> true
// call isBadVersion(4) -> true
// Then 4 is the first bad version.

// Implement a function to find the first bad version. You should minimize the number of calls to the API.

// Using binary search approach - Time complexity - O(log n)

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left =0;
        int right = n;
        
        while(left < right){
         int midpoint = left + (right - left)/2;
         if(isBadVersion(midpoint)){
         right = midpoint;
         }else {
          left = midpoint + 1;
         }
        }
        
        if(left == right && isBadVersion(left)){
          return left;
        }
        
        return -1;
    }
}
