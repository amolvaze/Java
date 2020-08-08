import java.util.*;

// code to find the container with the max water.
// Time Complexity - O(n)
// Space Complexity - O(1)
// Using two pointers approach.


class Main {
  public static int maxArea(int[] height) {
     int max =0;
     int i=0;
     int j = height.length-1;
     while( i< j)
     {
       if(height[i] < height[j])
       {
         max = Math.max(max, height[i] *(j-i));
         i++;
       }
       else
       {
         max = Math.max(max, height[j] * (j-i));
         j--;
       }
     }
     return max;
  }

  public static void main(String[] args) {
    int[] arr = {1,8,6,2,5,4,8,3,7};
    System.out.println(maxArea(arr));
  }
}
