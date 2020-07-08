import java.util.*;
// code to return longest common prefix in linear time.
class Main {
  public static String longestCommonPrefix(String[] strs) {
      if(strs.length == 0) {
         System.out.println("Input is empty!");
         return " ";
      }
       String prefix = strs[0];
       for(int i=0 ; i< strs.length; i++) {
         while(strs[i].indexOf(prefix) != 0){
          prefix = prefix.substring(0, prefix.length()-1);
         }
       }
       
       return prefix;
       //return " "; 
    }
  public static void main(String[] args) {
    String[] str = {"flower","flow","flight"};
    //String[] str = { };
    System.out.println(longestCommonPrefix(str));
  }
}
