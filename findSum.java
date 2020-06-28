import java.util.*;

// code to find out the sum of two integers whenver there are two arrays are given and we need to find if the given sum exists by adding those elements from those 2 array.

class Main {
// brute force approach - O(n^2)

public static boolean findSum(int[] a, int[] b, int sum){
for(int i=0; i< a.length; i++){
 int difference = sum - a[i];
    for(int j=0; j< b.length; j++){
      if(difference == b[i]) return true;
    }  
}
return false;
}

// Using HashSet in linear O(2n) ~ O9(n) time
public static boolean findSumHashSet(int[] a, int[] b, int sum) {

  HashSet<Integer> hs = new HashSet<>();
  for(int i=0; i< a.length; i++){
      int difference = sum - a[i];
      hs.add(difference);
  }
  for(int i=0; i< b.length; i++) {
    if(hs.contains(b[i])) return true;
  }
 return false;
 }


  public static void main(String[] args) {
   
   int[] a = {-3, 11,0,0};
   int[] b = {1,3,56,-5};
   int sum = -8;

    //System.out.println(findSum(a,b,sum));
    System.out.println(findSumHashSet(a,b,sum));
  }
}
