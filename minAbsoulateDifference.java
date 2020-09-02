import java.util.*;

// code to find the min abs difference.

class Main {
  public static List<List<Integer>> minimumAbsDifference(int[] arr) {
  
  Arrays.sort(arr);
  int min_diff = Integer.MAX_VALUE; 
  List<List<Integer>> result = new ArrayList();
  for(int i=1; i< arr.length; i++)
  {
    min_diff = Math.min(arr[i] - arr[i-1], min_diff);
  }
  
  for(int i= 1; i< arr.length; i++)
  {
    if(arr[i]- arr[i-1] == min_diff)
    { 
      List<Integer> pair = new ArrayList();
      pair.add(arr[i-1]);
      pair.add(arr[i]); // i is greater than i-1 so adding it later
      result.add(pair);
    }
  }
  
  return result;
  }
  public static void main(String[] args) {
    int[] arr = {4,2,1,3};
    System.out.println(minimumAbsDifference(arr));
  }
}
