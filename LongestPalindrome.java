/*
Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
*/

/* 

Time Complexity: O(N)O(N), where NN is the length of s. We need to count each letter.

Space Complexity: O(1)O(1), the space for our count, as the alphabet size of s is fixed. 

We should also consider that in a bit complexity model, technically we need O(\log N)O(logN) bits to store the count values.

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
// Alternative solution as follows:-

 public int longestPalindrome(String s) {
        
		//A palindrom can either have all even numbers of occurances of a character along with atmost one odd character.
		//The above logic is been implemented.
        int[] arr = new int[256];
        for(int i=0;i<s.length();i++)
            arr[s.charAt(i)]++;
        
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
                count++;
        }
        
		//If the count is 1 or less then the entire string can be a palindrom .
        if(count<=1)
            return s.length();
        else   //else only one odd number character along with all number of occuring characters can be a palindrom
            return (s.length()-count+1);
			
		// return count<=1? s.length():(s.length()-count+1);

    }

