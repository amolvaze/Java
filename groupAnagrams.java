import java.util.*;
// code to return group anagrams.
// Both time and space complity = O(nk) where n is the length of strs and k is the max length of strs in a string.
//  Counting each string is linear in the size of the string, and we count every string.
class Main {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
    if(strs.length == 0) { return new ArrayList(); }
   // List<List<String>> al = new ArrayList<>();
    HashMap<String, List<String>> map = new HashMap<>();  
    int[] count = new int[26];
    for(String s: strs) {
     Arrays.fill(count, 0);
     for (char c : s.toCharArray()) count[c - 'a']++; 
     StringBuilder sb = new StringBuilder();
     for(int i=0 ; i< 26; i++) {
       sb.append('#');
       sb.append(count[i]);     
       }
    
    String key = sb.toString();
    if(!map.containsKey(key))
      map.put(key, new ArrayList());
      map.get(key).add(s);
    }
   // return al;
   return new ArrayList(map.values());
   }


    public static void main(String[] args) {
   // String str = "babad";
  String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
    System.out.println(groupAnagrams(str));
  }
    
}
