// Given a balanced parentheses string S, compute the score of the string based on the following rule:

// () has score 1
// AB has score A + B, where A and B are balanced parentheses strings.
// (A) has score 2 * A, where A is a balanced parentheses string.
 

// Example 1:

// Input: "()"
// Output: 1
// Example 2:

// Input: "(())"
// Output: 2
// Example 3:

// Input: "()()"
// Output: 2
    
class Solution {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        int score=0;
        
        for(char c: S.toCharArray()){
          if(c == '('){
            stack.push(score);
             score =0;
          }  
            else{
           score = stack.pop() + Math.max(score * 2, 1);
            }
        }
        
        return score;
    }
}
