import java.util.*;

// code to check if a given string is palindrome or not

class Main {

 // function to check string is palindrome or not
class Solution {
       public boolean isPalindrome(String s) {
       int left=0; int right=s.length()-1;
       while(right>left){
       while(right>left && !Character.isLetterOrDigit(s.charAt(left))){
       left++;
       }
       while(right>left && !Character.isLetterOrDigit(s.charAt(right))){
       right--;
       }
       if(right>left && Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
       return false;
       }
       left++;
       right--;
       }
       return true;
       }
}

  public static void main(String[] args) {
    //System.out.println("Hello world!");
     String str = "XYXZ";
     String str2 = "XYX";
     System.out.println(isPalindrome(str));
     System.out.println(isPalindrome(str2));

  }
}

// Javascript solution is working fine for all test cases of Leetcode
var isPalindrome = function(s) {
s = s.toLowerCase().replace(/[^a-z0-9]/g, "");
return s.split("").reverse().join("") === s;
};
