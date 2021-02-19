import java.util.*;

// code to find the min abs difference.


// code to find the min abs difference.

// Time Complexity - O(n log n) and space complexity - O(1) - no extra space so constant time.

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

// ------------------------------------JavaScript Solution-------------------------------------------------------------------------------------

/**
 * @param {number[]} arr
 * @return {number[][]}
 */
var minimumAbsDifference = function(arr) {
    let minDifference = Infinity;
    let output = [];
    
	// sort the array
    arr.sort((a, b) => a - b);
    
	// find the min difference
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i + 1] - arr[i] < minDifference) {
            minDifference = arr[i + 1] - arr[i];
        }
    }
    
	// check which pairs are in the min difference
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i + 1] - arr[i] === minDifference) {
            output.push([arr[i], arr[i + 1]]);
        }
    }
        
    return output;
    
}




















