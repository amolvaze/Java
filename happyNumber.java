import java.util.*;

// code to check happy number

class Main {
  public static boolean isHappy(int n) {
   HashSet<Integer> set = new HashSet<>();
   while(n!= 1)
   {
     int current = n;
     int sum =0;
     while(current!=0)
     {
         sum += (current%10) *(current%10);
         current /=10;
     }
     if(set.contains(sum))
       {
         return false;
       }
    set.add(sum);
    n = sum;
   }

   return true;

  }
  public static void main(String[] args) {
    int n = 19;
    System.out.println(isHappy(n));
  }
}
