// # Write a function top_k_words(phrase, k) that returns the K most common words in a given phrase.
// # >>> example = 'once thrice twice thrice twice thrice'
// # In the example phrase above, we have "once" once, "thrice" three times, and "twice" twice.
 
// # If k=1, return the most common word, in this case "thrice".
// # >>> top_k_words(phrase=example, k=1)
// # ['thrice']
  
// # If k=2, return the two most common words in order of most common to least common.
// # >>> top_k_words(phrase=example, k=2)
// # ['thrice', 'twice']
  
// # If k=3, return the three most common words in order of most common to least common.
// # >>> top_k_words(phrase=example, k=3)
// # ['thrice', 'twice', 'once']
  
// # If k is greater than the number of different words, return all the words in order of most common to least common.
// # >>> top_k_words(phrase=example, k=4)
// # ['thrice', 'twice', 'once']
 
// # What do you think is the right thing to do if k=0?

// Time complexity - O(n log k)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 public static List<String> topKWords(String[] words, int k){
     // base case 
     if(words.length == 0 || k == 0){
         return Collections.emptyList();
     }
     if( k == words.length){
        System.out.println("Limit exceeded! ");
     }
     
     // map to keep track of no of words
     HashMap<String, Integer> map = new HashMap<String, Integer>();
     for(String word: words){
       map.put(word, map.getOrDefault(word, 0) + 1);
     }
     
 @SuppressWarnings("rawtypes")
    List<String> topWords =  new ArrayList(map.keySet());
    Collections.sort(topWords, (t1,t2) -> map.get(t1). equals(map.get(t2)) ? t1.compareTo(t2) : map.get(t2) - map.get(t1));
      return topWords.subList(0, k);  
 }

 public static void main(String[] args) {
    String input = "once thrice twice thrice twice thrice";
    String[] words = input.split(" ");
    int k = 4;
    System.out.println(topKWords(words, k));
        
   }
}
