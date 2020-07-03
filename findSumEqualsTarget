import java.util.*;

// To find the sum equal to given target in linear time O(n)

class Main {
 
public static void findSum(int[] nums, int target) {
 HashMap<Integer, Integer> map = new HashMap<>();
 int a=-1, b=-1;
        for (int i = 0; i <nums.length ; i++) {
            int num1 = nums[i];
            // calculate the difference.
            int num2 = target-num1;
            if(map.containsKey(num2)){
                a = i;
                b = map.get(num2);
                break;
            }
            map.put(num1, i);
          }
System.out.println("Given Input Array:- "+Arrays.toString(nums));
if(a!=-1 && b!=-1) {
  System.out.println("Indexes are "+a+" "+b);
}
else {
  System.out.println("Indexes not found: ");
}

}


  public static void main(String[] args) {
   int[] arr = {2,7,11,15};
   int target = 9;
   findSum(arr, target);
  }
}
