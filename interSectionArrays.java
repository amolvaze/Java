Ref - link -> https://medium.com/@punitkmr/intersection-of-two-arrays-ii-ffb26f04dfd1
import java.util.*;
// code to find the intersection of two arrays.
class Main {
public static void findIntersection(int[] nums1, int[] nums2) {
  
  if(nums1.length == 0 || nums2.length == 0 || nums1 == null || nums2 == null)  {
    System.out.println("Input array is empty: ");
    return;
  } 
// put nums1 content to map
  HashMap<Integer, Integer> map = new HashMap<>();
  for(int num:nums1){
     if(map.containsKey(num)){
       map.put(num,map.get(num)+1);
     }           
    else {   map.put(num,1); }
              
  }
// iterate through list for second array
List<Integer> list = new ArrayList<>();
for(int num: nums2) {
if(map.containsKey(num) && map.get(num) > 0){
  list.add(num);
  int freq = map.get(num);
  freq--;
  map.put(num, freq);
}  
}
   listToArray(list);         
  
  }
public static void listToArray(List<Integer> list) {
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }
    for(int i= 0; i< resultArray.length; i++) {
      System.out.println(resultArray[i]+" ");
    }
}
  public static void main(String[] args) {
    //int[] arr1 = {1,2,2,1};
    //int[] arr2 = {2,2};
    int[] arr1= {4,9,5};
    int[] arr2 = {9,4,9,8,4};
    findIntersection(arr1, arr2);
    // for(int i=0; i < resultArray.length; i++){
    //  System.out.println(resultArray[i]);
    // }
  }
}

/// -------------------------------------------------------------------------Using same above code with return type integer[]--------------------------------------------------


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0 || nums1 == null || nums2 == null) {
            //System.out.println("Empty input");
            return new int[0];
        }
        
        // put first array contents to map.
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums1){
         if(map.containsKey(num)){
             map.put(num, map.get(num) + 1);
         }
            else{
                map.put(num, 1);
            }
        }
        
      // Loop thru the list for second array contents to compare
        List<Integer> list = new ArrayList<>();
        for(int num: nums2){
          if(map.containsKey(num) && map.get(num) > 0){
              list.add(num);
              int freq = map.get(num);
              freq--;
              map.put(num, freq);
          }
        }
        
      return listToArray(list);  
        
    }
    
    public static int[] listToArray(List<Integer> list) {
      int[] resultArray = new int[list.size()];
      for(int i=0; i< list.size(); i++) {
          resultArray[i] = list.get(i);
      }
      
        // for(int i= 0; i< resultArray.length; i++){
        //     System.out.println(resultArray[i]+" ");
        // }
        return resultArray;
    }
    
    
}
