import java.util.*;

// code to check if a given string is palindrome or not

class Main {

 // function to check string is palindrome or not
 public static boolean isPalindrome(String str) {
     if(str == null || str.length() == 0) {
         return false;
     } 
   
     	for (int i = 0, j = str.length() - 1; i < j; ++i, --j) {
            
       if(str.charAt(i) != str.charAt(j)) {
          return false;
       }

     }

         
      return true;
 }


  public static void main(String[] args) {
    //System.out.println("Hello world!");
     String str = "XYXZ";
     String str2 = "XYX";
     System.out.println(isPalindrome(str));
     System.out.println(isPalindrome(str2));

  }
}