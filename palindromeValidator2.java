import java.util.*;

// code to return palindrome validator ||
/*
Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
*/

// Time complexity - O(n) and space complexity - O(1) - for two pointers 

class Main {

   public static boolean validPalindrome(String s) {
      int a_pointer =0;
      int b_pointer  = s.length()- 1; 

      while(a_pointer <= b_pointer)
      {
        if(s.charAt(a_pointer) != s.charAt(b_pointer))
        {
          return helper(s,a_pointer+1, b_pointer) ||
          helper(s, a_pointer, b_pointer-1);
        }
        a_pointer++;
        b_pointer--;
      }
  
    return true;

   }


   public static boolean helper(String s, int i, int j)
   {
      int a_pointer = i;
      int b_pointer = j; 

      while(a_pointer <= b_pointer)
      {
        if(s.charAt(a_pointer) != s.charAt(b_pointer))
        {
           return false;
        }
        a_pointer++;
        b_pointer--;
      }
  
    return true;
   }

  public static void main(String[] args) {
    String str = "aba";
    //String str = "abca"
    System.out.println(validPalindrome(str));
  }
}
