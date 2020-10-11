import java.util.*;
// code to return all nos disappeared in an array.

// Time Complexity - O(n) and Space Complexity - O(1) - no extra space.

// Input:
// [4,3,2,7,8,2,3,1]

// Output:
// [5,6]

class Main {

   public static List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i< nums.length; i++)
        {
            int curr = Math.abs(nums[i]);
            nums[curr-1] = - (Math.abs(nums[curr-1]));
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i =0; i< nums.length; i++)
        {
            if(nums[i] > 0)
            {
                result.add(i+1);
            }
        }
        
        return result;
        
    }
   
    // Using extra space - with hashset

  public static List<Integer> findDisappearedNumbers(int[] nums) { 
    List<Integer> res = new ArrayList();
    HashSet<Integer> set = new HashSet<>();
    for(int num : nums){
      set.add(num);
    }
   for(int i= 1; i<=nums.length; i++){
       if(!set.contains(i)){
         res.add(i);
       }
   }

   return res;
  }
   
  public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    System.out.println(findDisappearedNumbers(arr));
  }
}







