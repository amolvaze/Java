import java.util.*;

// code to return the sorted sqaured array when input is given as sorted array.
// n log n solution
class Main {
  public static void soredSquaredArray(int[] a){
   int[] newArray = new int[a.length];
   for(int i=0; i< a.length; i++){
   newArray[i] = a[i] * a[i];  
   }
   Arrays.sort(newArray);
   for(int j=0; j< newArray.length; j++){
     System.out.println(newArray[j]+" ");
   }
}

// log n liner time solution 

public static void sortedSqArray(int[] a) {
  int[] resultArray = new int[a.length];
  int left= 0;
  int right= a.length -1;
  for(int i= a.length-1; i >=0; i--) {
  if(Math.abs(a[left]) > a[right]){
     resultArray[i] = a[left] * a[left];
     left ++;
  }
   else {
   resultArray[i] = a[right] * a[right];
    right--; 
   }
  }
   for(int j=0; j< resultArray.length; j++){
     System.out.println(resultArray[j]+" ");
   }
}

  public static void main(String[] args) {
    int[] arr = {-1,0,2,5,11,90};
    // for unsorted input array
    // int[] arr = {5,4,-3,11};
    soredSquaredArray(arr);
    System.out.println("Following using a linear solution. ");
    sortedSqArray(arr);
  }
}