// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

//   Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false
// Example 4:

// Input: pattern = "abba", s = "dog dog dog dog"
// Output: false

// Time complexity : O(N)O(N) where NN represents the number of words in the s or the number of characters in the pattern.

// Space complexity : O(M)O(M) where MM is the number of unique characters in pattern and words in s.

import java.util.HashMap;

class Main {
  
  public static boolean wordPattern(String pattern, String s) {
     HashMap map_index = new HashMap<>();
     String[] words = s.split(" ");
     
     if(words.length != pattern.length()) return false;

     for(int i=0; i< words.length; i++){
       char c = pattern.charAt(i);
       String w = words[i];
       
       if(!map_index.containsKey(c)){
         map_index.put(c,i);
       }

        if(!map_index.containsKey(w)){
         map_index.put(w,i);
       }

       if(map_index.get(c) != map_index.get(w)){
         return false;
       }

     }
  

   return true;
  }

  public static void main(String[] args) {
    String pattern = "abba";
    String s = "dog dog dog dog";
    System.out.println(wordPattern(pattern, s));
  }
}
