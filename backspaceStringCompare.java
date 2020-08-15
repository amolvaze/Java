import java.util.*;
// Code for backspaxe string compare using a Stack Approach

// Time and Space Complexity - O(M+N)


class Main {
   public static boolean backspaceCompare(String S, String T) {
     Stack<Character> sStack = new Stack();
     Stack<Character> tStack = new Stack();
      
        for(char c: S.toCharArray())
        {
            if(c != '#')
            {
                sStack.push(c);
                
            }
            else if(!sStack.isEmpty())
            {
                sStack.pop();
            }
        }
        
         for(char c: T.toCharArray())
        {
            if(c != '#')
            {
                tStack.push(c);
                
            }
            else if(!tStack.isEmpty())
            {
                tStack.pop();
            }
        }
        
        while(!sStack.isEmpty())
        {
            char current = sStack.pop();
            if(tStack.isEmpty() || current!=tStack.pop())
            {
                return false;
            }
        }
        
      return sStack.isEmpty() && tStack.isEmpty();  
        
    }
  public static void main(String[] args) {
    String s = "ab#c";
    String t = "ad#c";
    //  String s = "a#c";
    // String t = "b";
    System.out.println(backspaceCompare(s,t));
  }
}
