// HackerRank
/*
STDIN           Function
-----           --------
3               n = 3
{[()]}          first s = '{[()]}'
{[(])}          second s = '{[(])}'
{{[[(())]]}}    third s ='{{[[(())]]}}'

Sample Output

YES
NO
YES

*/

public static String isBalanced(String s) {
    // Write your code here
     Stack<Character> stack = new Stack();
     
     for(int i=0; i < s.length(); i++) {
        if(s.charAt(i) == '(' || s.charAt(i) == '{' ||s.charAt(i) == '['){
            stack.push(s.charAt(i));
        } else {
            if(stack.isEmpty()) {
                return "NO";
            } else{
                char val = stack.pop();
                if(s.charAt(i) == ')' && val != '(') {
                     return "NO";
                } else if(s.charAt(i) == '}' && val != '{') {
                    return "NO";
                } else if(s.charAt(i) == ']' && val != '[') {
                    return "NO";
                }
            }
        }
     }
     
     if(stack.isEmpty()) {
         return "YES";
     } else {
        return "NO";
     }
      
    }

}
