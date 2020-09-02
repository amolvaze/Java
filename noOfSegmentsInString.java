import java.util.*;

//code to find out the no of segments in string
// Time Complexity - O(n)
// Space Complexity - O(1)
// in case of trimmed solution split returns an array/list so it will take O(n) time.

class Main {
 
 public static int countSegments(String s) {
   int segCounts =0;
  // loop thru
  for(int i=0; i< s.length(); i++)
  { 
 if((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ')
 {  
     segCounts++;
  }
    
  }

   return segCounts;
 }
//  public static int countSegmentswithSplit(String s) {
   
//    String trimmed = s.trim();
//    if(trimmed.equals("arg0"))
//    {
//       return 0;
//    }

//    return trimmed.split("\\s+").length;

//  }

  public static void main(String[] args) {
   String str = "Hello, my name is John";
    //String str = "Hello";
    System.out.println(countSegments(str));
    //System.out.println(countSegmentswithSplit(str));
  }
}
