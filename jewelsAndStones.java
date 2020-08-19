import java.util.*;

// code for jewels and stones 

// Time and Space Complexity - O(n) and O(1)

class Main {

 public static int numJewelsInStones(String J, String S) {
    int counter = 0;
   
   for(int i=0; i< S.length(); i++)
   {
     if(J.indexOf(S.charAt(i)) > -1)
     {
       counter+=1;
     }
   }

   return counter;
 
 }

  public static void main(String[] args) {
    String str1 = "aA";
    String str2= "aAAbbbb";
    // String str1 = "z";
    // String str2= "ZZ";
    System.out.println(numJewelsInStones(str1,str2));
  }
}
