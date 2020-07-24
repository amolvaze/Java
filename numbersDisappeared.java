import java.util.*;
// code to return all nos disappeared in an array.

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
  public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    System.out.println(findDisappearedNumbers(arr));
  }
}
