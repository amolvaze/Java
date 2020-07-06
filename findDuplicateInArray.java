import java.util.*;
// code to find the duplicate no in an array.
// This will take O(2n) ~ o(n) linear time 
class Main {
  public static int findDuplicte(int[] a){
     if(a.length == 0) {return -1; }
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i< a.length; i++) {
      if(map.containsKey(a[i])){
       map.put(a[i], map.get(a[i]) +1);
      }
      else {
        map.put(a[i], 1);
      }
    }
    
    // loop thru to check if count is greather than 1
    for(int i=0; i< a.length; i++){
     if(map.get(a[i]) > 1) return a[i];
    }
   
   return -1;
  }

  public static void main(String[] args) {
    int[] arr = {1,3,4,2,2};
   // int[] arr = {3,1,3,4,2};
    //int[] arr = {};
    System.out.println(findDuplicte(arr));
  }
}
