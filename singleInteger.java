import java.util.*;
// Given a non-empty array of integers, every element appears twice except for one. Find that single one.
class Main {
  public static int singleInteger(int[] a) {
    if(a.length == 0) {
     System.out.println("Inout array is empty");
     return -1;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i< a.length; i++) {
      if(map.containsKey(a[i])){
        map.put(a[i], a[i] + 1);
      }
      else {
        map.put(a[i], 1);
      }
    }

  // loop through to get count 1 to return
  for(int i= 0; i< a.length; i++) {
    if(map.get(a[i]) == 1) return a[i];
  }
return -1;
  }
  public static void main(String[] args) {
    //int[] arr = {2,2,1};
    int[] arr = {4,1,2,1};
    System.out.println(singleInteger(arr));
  }
}
