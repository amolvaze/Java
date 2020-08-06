import java.util.*;
// Longest Substring Without Repeating Characters
// Time complexity - O(n) // interating thru while and if O(2n) ~ O(n) ?
// Space complexity - O(1) //set?

class Main {
  public static int lengthOfLongestSubstring(String s) {
   int i=0, j=0, max=0;
   HashSet<Character> set = new HashSet();
   while( j < s.length())
   {
     if(!set.contains(s.charAt(j)))
     {
       set.add(s.charAt(j));
       j++;
       max = Math.max(max, set.size());
     }
     else
     {
       set.remove(s.charAt(i));
       i++;
     }
   }  
  return max;

  }

  public static void main(String[] args) {
    String str = "abcabcbb";
    //String str = "pwwkew";
    System.out.println(lengthOfLongestSubstring(str));
  }
}
