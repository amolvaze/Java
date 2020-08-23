import java.util.*;

// Code to return list of self dividing no.

/*Time Complexity: O(D)O(D), 

where DD is the number of integers in the range [L, R][L,R], and assuming \log(R)log(R) is bounded. (In general, the complexity would be O(D\log R)O(DlogR).)

Space Complexity: O(D)O(D), the length of the answer.
*/


class Main {
 
  public static List<Integer> selfDividingNumbers(int left, int right) { 
      
   List<Integer> res = new ArrayList();
  // loop thru 
  for(int i= left; i<=right; i++)
  {
     if(selfDividing(i))
     {
       res.add(i);
     }
  }
   
   return res;
  }

  public static boolean selfDividing(int n)
  {
     int x = n;
     while(x >0)
     {
      int d = x%10;
      x/=10;
      // since zero is not allowed and  n%d > 0 that means, it is not divisible so we will return false.
      if( d==0 || (n%d > 0) ) return false;
     }
     return true;
  }


  public static void main(String[] args) {
   int left = 1, right = 22;
    System.out.println(selfDividingNumbers(left,right));
  }
}
