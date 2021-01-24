// Given a string s of '(' , ')' and lowercase English characters. 

// Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

// Formally, a parentheses string is valid if and only if:

// It is the empty string, contains only lowercase characters, or
// It can be written as AB (A concatenated with B), where A and B are valid strings, or
// It can be written as (A), where A is a valid string.
 

// Example 1:

// Input: s = "lee(t(c)o)de)"
// Output: "lee(t(c)o)de"
// Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
    
class Solution {
    public String minRemoveToMakeValid(String s) {
      
        StringBuilder sb = new StringBuilder();
         int open =0;
        
        for(char c: s.toCharArray()){
            if( c == '('){
             open++;
            }
            else if(c == ')') {
             if(open == 0) continue; // logic to handle close one before opening one - ) before (
             open--;
            }
            
            sb.append(c);
        }
        
         // logic to handle this case - ()( - to remove extra ( after () valid pair.
        StringBuilder result = new StringBuilder();
        
        for(int i = sb.length()-1; i>=0; i--){
           if(sb.charAt(i) == '(' && open-- > 0) continue;
            
            result.append(sb.charAt(i));
        }
        
        return result.reverse().toString(); // we need to reverse as we are traversing backwards in the for loop.
        
    }
}
