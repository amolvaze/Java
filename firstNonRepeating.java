import java.util.*;
// code to return first non repeating character in string

class Main {
  
  // Brute force solution - O(n^2)
  public static char firstNonRepat(String s){
    for(int i=0; i< s.length(); i++){
       boolean duplicate = false;
       for(int j=0; j< s.length(); j++) {
          if(s.charAt(i) == s.charAt(j) && (i != j)) {
             duplicate = true;
             break;
          }
       }

     if(!duplicate) return s.charAt(i);  
    }
    
     return '_';
  }

  // O(2n) ~ O(n) linear time solution using hashmap

  public static char firstNonRepating(String s) {
    //System.out.println(s);
   HashMap<Character, Integer> map = new HashMap<>();
for(int i= 0; i< s.length(); i++) {
  char c = s.charAt(i);
  if(map.containsKey(c) ){
       map.put(c, map.get(c) + 1); 
  }
  else {
    map.put(c, 1);
  }
}

for(int i=0; i< s.length(); i++){
   char c = s.charAt(i);
if(map.get(c) == 1) return c;
}

     return '_';
  }

// code in liner time using IndexOF and LastIndex Of 

public static char firstNonRepating2(String s) {
for(int i=0; i< s.length(); i++) {
if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
    return s.charAt(i);
}  
}
 return '_';
}
  
  // When asked to return an index of first non repeating character then following is the change to above function.
//   public static int firstNonRepating2(String s) {
// for(int i=0; i< s.length(); i++) {
// if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
//     //return s.charAt(i);.
//      return i;
// }  
// }
//  return -1;
// }
  
  // Another approach using interget count array of 26 - so only that much of the space.
  
 public static char firstNonRepating2(String s) {
  int[] char_counts = new int[26];
   
  // loop thru
  for(char c: s.toCharArray() ) char_counts[c-'a']++;
  
  // Again loop thru  
  for(char c: s.toCharArray()) 
  {
    if(char_counts[c-'a'] == 1) return c;
  }
   
 return '_';
}
  

  public static void main(String[] args) {
    String s = "aaabccccdddf";
   // System.out.println(firstNonRepat(s));
    //System.out.println(firstNonRepating(s));
    System.out.println(firstNonRepating2(s));
  }
}
