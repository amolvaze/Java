import java.util.*;

// Code to check if the given no is perfect square or not

class Main {
  
   public static boolean isPerfectSquare(int n) {
       for(int i =1 ; i * i <=n; i++) {

         if((n%i == 0) && (n / i  == i)){
           return true;
         }

       }

       return false;
   }


  public static void main(String[] args) {
    int n =36;
    System.out.println(isPerfectSquare(n));
  }
}
