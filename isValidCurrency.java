import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'isCurrency' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING strAmount as parameter.
     */
   
    public static boolean isCurrency(String strAmount) {
    // Write your code here

String commaPattern = "^\\(?-?[$€¥]([0-9]{1,3}(,[0-9]{3})*(\\.[0-9]{2})?)\\)?$";
String noCommaPattern = "^\\(?-?[$€¥]([0-9]+(\\.[0-9]{2})?)\\)?$";
      Pattern p1 = Pattern.compile(commaPattern);
      Matcher m1 = p1.matcher(strAmount);
      
      Pattern p2 = Pattern.compile(noCommaPattern);
      Matcher m2 = p2.matcher(strAmount);
     
      if(!m1.matches() && !m2.matches()) return false;
     
      return validateLeadingZeros(strAmount) && validateNegative(strAmount) && validateYen(strAmount);
    }
    // method to handle negatives
    private static boolean validateNegative(String str){
       if(str.charAt(0) == '(') {
           return (str.charAt(1) != '-' 
           && 
           str.charAt(str.length()-1) == ')');
       }
       if(str.charAt(str.length()-1) == ')') return false;
       return true;
    }
    
    // method to handle yen currency validation
     private static boolean validateYen(String str){
        if(str.contains("¥") && str.contains(".")) return false;
        return true;
     }
     
     // method to handle leading zeros
     private static boolean validateLeadingZeros(String str){
         String newStr = str.replaceAll(",", "")
                            .replaceAll("\\(", "")
                            .replaceAll("\\)", "")
                            .replaceAll("\\$", "")
                            .replaceAll("€", "")
                            .replaceAll("¥", "");
        
        if(newStr.charAt(0) == '0' && newStr.length() > 1) 
          return (newStr.charAt(1) == '.');
          
          return true;                   
     }
}
