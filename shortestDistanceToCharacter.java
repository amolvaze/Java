// Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

// Example 1:

// Input: S = "loveleetcode", C = 'e'
// Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 

// Note:

// S string length is in [1, 10000].
// C is a single character, and guaranteed to be in string S.
// All letters in S and C are lowercase.


// Time and Space Complexity- O(n)

class Solution {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] output_arr = new int[n];
        int c_position = -n;
        
        for(int i=0; i< S.length(); i++){
            if(S.charAt(i) == C){
                c_position =i;
            }
            
            output_arr[i] = i-c_position;
        }
        
        for(int i= n-1; i>=0; i--){
             if(S.charAt(i) == C){
                c_position =i;
             }
         output_arr[i] = Math.min(output_arr[i], Math.abs(i-c_position));
        }
        
        return output_arr;
    }
}
