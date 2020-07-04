import java.util.*;

// code to move zeros at end in O(n) time
class Main {
   public static void moveZeros(int[] a){
     int index = 0;
     for(int i=0; i< a.length; i++){
        if(a[i] != 0){
          a[index++] = a[i];
        }
     }
 
   for(int i = index; i< a.length; i++) {
       a[i] =0;
   }

   }

  public static void main(String[] args) {
    int arr[] = {0, 1, 0, 3, 4, 0, 5, 5, 0, 0, 0, 8, 7};
    moveZeros(arr);
    for(int i=0; i< arr.length; i++) {
    System.out.println(arr[i]);  
    }
  }
}
