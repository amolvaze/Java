// Given two strings s and t, check if s is a subsequence of t.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
// of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

//  Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false

// Time complexity - O(N) and Space Complexity - O(1) - constant space. 

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() == 0) return true;
        
        int s_pointer= 0;
        int t_pointer=0;
        
        while(t_pointer < t.length()){
         
            if(t.charAt(t_pointer) == s.charAt(s_pointer))
                s_pointer++;
            if(s_pointer == s.length()) return true;
            
            t_pointer++;
        }
        
        return false;
    }
}
