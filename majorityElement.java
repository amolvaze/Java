import java.util.*;

// code to find majority element
// Time complexity - O(n)
// Space complexity - O(1)

class Main {
  public static int majorityElement(int[] nums) {
         Integer cand = null;
         int count = 0;
         for(int num: nums)
         {
           if(count == 0)
           {
            cand = num;
           }
        count+=cand==num?1:-1;   

         }
    return cand;
  }
  public static void main(String[] args) {
    int[] arr = {3,2,3};
    //int[] arr = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(arr));
  }
}
