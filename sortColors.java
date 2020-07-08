import java.util.*;

// code to sort colors 

// using a one pass approach.

class Main {
  // function to sort colors
 public static void sortColors(int[] a) {
    if(a.length == 0 || a.length == 1){
    System.out.println("Input array is empty. ");
    return;
    }
    int start = 0;
    int end = a.length -1;
    int index = 0;
    while(index <= start && start < end ) {
     if(a[index] == 0) {
       a[index] = a[start];
       a[start] = 0;
       start++;
       index++;
     }else if( a[index] == 2) {
       a[index] = a[end];
       a[end] = 2;
       end--;
     }else{
       index++;
     }

    }

    for(int i=0; i< a.length; i++) {
      System.out.println(a[i]+" ");
    }

 }

  public static void main(String[] args) {
    //int[] arr = {2,0,2,1,1,0};
    int[] arr = {};
    sortColors(arr);
    
  }
}
