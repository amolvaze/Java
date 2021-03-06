// Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. 
    
// You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
    
// Example 1:

// Input: "abab"
// Output: True
// Explanation: It's the substring "ab" twice.
// Example 2:

// Input: "aba"
// Output: False
    
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = len/2; i>=1; i--){
            if( len % i == 0){
                int num_repeats = len/ i;
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for(int j=0; j < num_repeats; j++){
                    sb.append(substring);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        
        return false;
    }
}
