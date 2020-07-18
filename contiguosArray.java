import java.util.*;

// code to return continguos array 

// Hash map appoach

//Input: [0,1] 
//Output: 2
//Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

//Input: [0,1,0]
//Output: 2
//Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

class Main {
  public static int findMaxLength(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap();
    map.put(0,-1);
     int count = 0;
     int max_length=0;
     for(int i=0; i< nums.length; i++) {
      if(nums[i] == 0) {
        count+=-1;
      }else {
        count+=1;
      }
    if(map.containsKey(count)) {
     max_length = Math.max(max_length, i-map.get(count));
        }
    else {
      map.put(count, i);
    }
     }
     return max_length;
   }


  public static void main(String[] args) {
    int[] arr = {0,1,0};
    System.out.println(findMaxLength(arr));
  }
}
