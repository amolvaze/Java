import java.util.*;

// code to return unique morse words

/*
Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
*/
  
class Main {

   public static int uniqueMorseRepresentations(String[] words) {
     
     HashSet<String> set = new HashSet<>();
   
      String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

     for(String word: words)
     {
       StringBuilder sb = new StringBuilder();

       for (char c : word.toCharArray())
       {
         sb.append(MORSE[c-'a']);
       }
      
      set.add(sb.toString());

     }
     
     return set.size();

   }
  public static void main(String[] args) {
    String[] words = {"gin", "zen", "gig", "msg"};
    System.out.println(uniqueMorseRepresentations(words));
  }
}
