import java.util.*;

// Code to find the long pressed name using two pointers appoach.

class Main {
public static boolean isLongPressedName(String name, String typed) {

 if(name.length() == typed.length()) return true;
 if(name.length() > typed.length()) return false; // Long pressed string length should  be always greater
 
 int i=0; // pointer for named one.
 int j=0; // pointer for typed one.
  
while( j < typed.length())
{
 
 if( i < name.length() && name.charAt(i) == typed.charAt(j))
 {
   i++;
 }
 else if( j == 0 || typed.charAt(j) != typed.charAt(j-1))
 {
   return false;
 }

 j++;

}

return i == name.length();

}
  public static void main(String[] args) {
   String name = "saeed";
   String typed = "ssaaedd";
   System.out.println(isLongPressedName(name,typed));
  }
}
