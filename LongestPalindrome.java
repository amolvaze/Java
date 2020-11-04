/*
Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
*/

class Main {
  public static int longestPalindrome(String s) {
   if(s.length() == 0 || s == null)
    return -1;
    int result = 0;
   int[] char_counts = new int[128]; 
  for(char c : s.toCharArray()){
    char_counts[c]++;
  }

  for(Integer char_count: char_counts ){
    result += char_count/2 * 2;
    if(result % 2 == 0 && char_count % 2 == 1){
      result += 1;
    }
  }
  return result;
  }
  public static void main(String[] args) {
    String s = "";
    System.out.println(longestPalindrome(s));
  }
}
