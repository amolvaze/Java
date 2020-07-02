// Code developed by Amol Vaze - July 2020

// Code to check if the file extension entered by the user is .html or not It should only accepts .html and not any other thing. Code takes care of blank spaces.

import java.util.*;

class Main {

  public static void check(String str) {
   if(str == null || str.isEmpty() ) { 
     System.out.println("Input string is empty: ");
     return;
   }
   str= str.toLowerCase();
   String extension = str.split("\\.")[1];
   String newstring1 = "."+extension;
   String newstring2= ".html";
 if(newstring1.equals(newstring2)) {
  System.out.println("File extension is accepted.");
 }else{
 System.out.println("File extension is not accepted.");  
 }
 
  }

  
  public static void main(String[] args) {
    // considering all possible simple cases.
    String str1 = "index.html";
    String str2= "";
    String str3 = "index.txt";
    check(str1);
    check(str2);
    check(str3);
  }
}
