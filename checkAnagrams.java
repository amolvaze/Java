import java.util.*;
// code to check if one string is anagram of other
class Main {
   public static boolean checkAnagram(String s, String t){
      // find length of both the strings
      int n1= s.length();
      int n2 = t.length();
    // System.out.println(n1);
    // System.out.println(n2);
    if(n1!=n2) {
      System.out.println("Given strings are not anagram.");
      return false;
    }
    
    char[] arr1 = s.toCharArray();
    char[] arr2 = t.toCharArray();
    Arrays.sort(arr1); // n log n
    Arrays.sort(arr2);
   // System.out.println(arr1);
   // System.out.println(arr2);
   return Arrays.equals(arr1, arr2); 
     
    
        //return true; 
    } 

  public static void main(String[] args) {
   // int[] arr = {1,1,2};
    //removeDuplicates(arr);
  // String s1 = "rat";
  // String s2= "car";
  String s1 = "anagram";
  String s2= "nagaramw";
  System.out.println(checkAnagram(s1,s2));


  }
}
