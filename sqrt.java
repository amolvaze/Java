import java.util.*;

// code to find squre root of a given number.

class Main {
  public static int calSqrt(int x) {
    long start = 0;
    long end = x;
    while(start + 1< end) {
      long mid = start + (end - start) /2;
      if(mid * mid == x) {
        return (int) mid;
      } else if(mid * mid < x) {
         start = mid;    
      }
      else {
        end = mid;
      }
    }

    if(end * end == x) {
      return (int) end;
    }

    return (int) start;
      
  }
  public static void main(String[] args) {
    int x = 8;
    System.out.println(calSqrt(x));
  }
}
