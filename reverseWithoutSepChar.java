import java.util.*;

// code to reverse a given string for all alphabets without special characters. 

// O(n)- Time complexity. 

class Main {
 
  public static void reverseString(char str[]){
    
    // left and right pointers are initalized.
    int left= 0, right = str.length-1;
    // loop through string
   
    while(left < right) {
      
      // ignore special characters.
    if(!Character.isAlphabetic(str[left])){ left++; }
    else if(!Character.isAlphabetic(str[right])) { right--;}
     
    // if there is alphabets

   else {
       char temp = str[left];
       str[left] = str[right];
       str[right] = temp;
       left++;
       right--;

   }
      
    }


  }

  public static void main(String[] args) {
   // String str = "a!!!b.c.d,e'f,ghi";
    String str = "+h&e/! L@_L! O? ";
    char[] charArray = str.toCharArray();
   System.out.println("Input String: "+str);
   reverseString(charArray);
   String revStr= new String(charArray);
   System.out.println("Output String: "+revStr);

  }
}
