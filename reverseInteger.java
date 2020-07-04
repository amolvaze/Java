import java.util.*;
// code to reverse a given intger without recusion.
class Main {

 public static int reverse(int num){
    int rev= 0;
    while(num > 0){
      rev= rev * 10 + num % 10;
      num = num/10;
    }
    return rev;
 }

// code with recursion
  
public static int reverseRecursion(int num, int rev) {
  
  return (num == 0) ? rev: reverseRecursion(num / 10, rev * 10 + num % 10);

}
 
  public static void main(String[] args) {
   int num = 1234;
   System.out.println(reverse(num));
   //System.out.println(reverseRecursion(num, 0));
  }
}
