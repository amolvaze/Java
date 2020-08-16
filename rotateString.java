import java.util.*;

// code to rotate String
// Time Complexity - O(N^2)
// Space Complexity - O(N) - to build space for A+A

/* Example 1:
Input: A = 'abcde', B = 'cdeab'
Output: true

Example 2:
Input: A = 'abcde', B = 'abced'
Output: false

*/

class Main {

  public static boolean rotateString(String A, String B) {
   
   return ((A.length() == B.length()) && (A+A).contains(B));

  }
  public static void main(String[] args) {
   String str1 = "abcde";
   String str2= "cdeab";
    // String str1 = "abcde";
    // String str2= "abced";
    System.out.println(rotateString(str1,str2));
  }
}
