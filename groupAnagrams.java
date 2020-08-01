import java.util.*;
//code to return group anagrams
// Both time and space complity = O(nk) where n is the length of strs and k is the max length of strs in a string.
//  Counting each string is linear in the size of the string, and we count every string.
import java.util.*;

// code to group anagrams - 0(nk) time and space complexity.

class Main {

  public static List<List<String>> groupAnagrams(String[] strs) { 
 List<List<String>> res = new ArrayList<>();
   if(strs.length == 0)
   return res;
 
 HashMap<String, ArrayList<String>> map  = new HashMap<>();
    
   for(String str : strs)
   {
      int[] count = new int[26];
      for(int i=0; i < str.length(); i++)
      {
        count[str.charAt(i) - 'a']++;
      }

   

   StringBuilder sb = new StringBuilder();
   for(int c : count)
    {
      sb.append(c);
      sb.append('#');
    }
  
  String rep = sb.toString();
  
  if(map.containsKey(rep))
  {
  ArrayList<String> ana = map.get(rep);
  ana.add(str);
  map.put(rep, ana);
  }
  else
  {
  ArrayList<String> ana = new ArrayList<>();
  ana.add(str);
  map.put(rep, ana);
  }
}

for(List<String> val : map.values())
 {
   res.add(val);
 }

return res;

  }
  public static void main(String[] args) {

   String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat"}; 	
    System.out.println(groupAnagrams(arr)); 
  }
}
