import java.util.*;
// code to reverse words in string

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

class Main {
  public static String reverseWords(String s) {
      if(s == null || s.length() == 0)
      return "";
      // spilt string by the space.
      String[] arr = s.split(" ");
     // for(int i =0; i < arr.length; i++)
     // {
      //  System.out.println("Arr contents: " +arr[i]);
     // }
      
    StringBuilder sb = new StringBuilder();
      // iterate through the string
     for (int i = arr.length - 1; i >= 0; --i) {
      {
        if(!arr[i].equals(" "))
        sb.append(arr[i]).append(" ");
      }
 return sb.length() == 0 ? " " : sb.substring(0, sb.length()-1);
  }
  public static void main(String[] args) {
    String str = "the sky is blue";
    System.out.println(reverseWords(str));
  }
}
