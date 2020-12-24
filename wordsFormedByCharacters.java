
Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: 
The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: 
The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

import java.util.*;
class Main{
 public static int countCharacters(String[] words, String chars) {
     int good_word_length_sum =0;
     int[] char_counts = new int[26];
     // loop thru chars
     for(char c : chars.toCharArray()){
      char_counts[c-'a']++;
     }
     
     // loop thru words
     for(String word : words){
       int[] temp_char_counts = Arrays.copyOf(char_counts, char_counts.length);
     int valid_count=0;
     for(char c: word.toCharArray()){
        if(temp_char_counts[c-'a'] > 0){
           valid_count++;
           temp_char_counts[c-'a']--;
        }   
     }
     if(valid_count == word.length()){
      good_word_length_sum += word.length();
     }

     }



     return good_word_length_sum;
  }


  public static void main(String[] args) {
  // String[] words = {"cat","bt","hat","tree"};
  // String chars = "atach";
  String[] words = {"hello", "world", "leetcode"};
  String chars = "welldonehoneyr";
 System.out.println(countCharacters(words,chars));
  }
}
