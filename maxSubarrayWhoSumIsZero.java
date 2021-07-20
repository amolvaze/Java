import java.util.*

public static maxSubArray(int[] arr){
 
 int maxLength= 0;
 
 HashMap<Integer, Integer> map = new HashMap<>();
 
 int i= -1;
 int sum =0;
 
 map.put(sum, i);
 
 while(i < arr.length-1) {
  
  i++;
  sum+= arr[i];
  
  if(map.containsKey(sum)== false) {
   map.put(sum, i);
  }
  else {
  int len = i - map.get(sum);
  if(len > maxLength) {
   maxLength = len;
   }
  }
 
 }
 
 return maxLength;

}
