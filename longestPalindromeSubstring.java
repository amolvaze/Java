import java.util.*;

// code to return lingest palindromic substring
// Time complexity - O(n^2) better than brute force - O(n^3)
// Space complexity - O(1)

class Main {

  public static String longestPalindrome(String s) { 
   if(s.length() <= 1)
    return s;
  int start =0, end =0, len=0, len1=0, len2=0;
    for(int i= 0; i< s.length(); i++)
    {
      len1 = expandAroundCenter(s,i,i);
      len2 = expandAroundCenter(s,i,i+1);
      len = Math.max(len1, len2);
      if(len > end- start)
       {
         start = i - (len-1)/2;
         end = i + len/2;
       }    
    }

    return s.substring(start, end+1);

  }

  public static int expandAroundCenter(String s, int i, int j)
  {
    while(i >=0 && j< s.length() && s.charAt(i) == s.charAt(j))
    {
      i--;
      j++;
    }
  
    return j-i-1;

  }

  public static void main(String[] args) {
   String str = "babad";
   //String str = "cbbd";
   System.out.println(longestPalindrome(str));
  }
}
