import java.util.*;

// code to return decode string - O(n) time

class Main {
   public static String decodeString(String s) {
    // Two stacks one for digits and one for characters
    Stack<Integer> si = new Stack<>();
    Stack<String> ss = new Stack<>();
    int index = 0;
    String res = " ";
    while(index < s.length())
    {
      char curr = s.charAt(index);
      if(Character.isDigit(curr))
      { 
        int num = 0;
        while(Character.isDigit(s.charAt(index)))
        {
          num = num * 10 + s.charAt(index) - '0';
          index++; 
        }   
      si.push(num);
      }else if(curr == '[')
      { 
        ss.push(res);
        res = "";
        index++;
      }
      else if(curr == ']')
      {
        StringBuilder sb = new StringBuilder(ss.pop());
        int count = si.pop();
      for(int i= 1; i<=count; i++) 
        sb.append(res);
        res = sb.toString();
        index++; 
      }
      else 
      {
        res +=curr;
        index++;
      }
    }

  return res;
   }
  public static void main(String[] args) {
   String str = "3[a]2[bc]";
   System.out.println(decodeString(str));
  }
}
