import java.util.*;

// code to return the palindrome no - includes reverse integer logic

class Main {
   public static boolean isPalindrome(int x) { 
   
    if(x==0) return true;
    if( x< 0 || x %10 == 0 ) {
      return false;
    }

    int rev = 0;
    while( x > rev)
    {
      rev = rev * 10 +  x % 10;
      x= x/10;
    }

    if( x == rev || x == rev/10)
    {
       return true;
    }
    else
    {
      return false;
    }

   }
  public static void main(String[] args) {
    int n = 121;
    //int n = -121;
    //int n = 10;
    System.out.println(isPalindrome(n));
  }
}
