import java.util.*;

// code to move all the zeros to end of array

// O(3n) ~ O(n) linear time

class Main {
  public static void moveZeroAtEnd(int[] a) {
   
   // initialize k to zero
   int k= 0;
   // loop through a given array to check if there is nonzero 
   for(int i : a){
      
      if(i!=0){
        a[k++] = i; // both operations in single statement.
        //a[k] = i;
         //k++;
      }

   }
// now to move all zeros at the end
for(int i=k; i < a.length; i++){
  a[i] = 0;
}

  }
  public static void main(String[] args) {
    int[] arr = {1,45,0,56,0, 4,44,0,100,0, 77, 5};
    moveZeroAtEnd(arr);
    System.out.println(Arrays.toString(arr));
  }
}

//1,45,45.4,44,100,77,5,
