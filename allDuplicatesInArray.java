import java.util.*;
//code to find all the duplicates in a given array using lienar O(n) time and no space.

class Main {
  public static List<Integer> findAllDuplicates(int[] nums) { 
  List<Integer> outputArray = new ArrayList();
  if(nums.length == 0 || nums == null) {
    System.out.println("Input is empty!");
    return new ArrayList<>();
  }
   // Loop thru given array
   for(int i=0; i< nums.length; i++) 
   {
      int index = Math.abs(nums[i])-1;
      if(nums[index] < 0) outputArray.add(index+1);
      nums[index] = -nums[index];
   }
  return outputArray;
  }
  public static void main(String[] args) {
   int[] arr = {4,3,2,7,8,2,3,1};
   //int[] arr = {};
   System.out.println(findAllDuplicates(arr));
  }
}
