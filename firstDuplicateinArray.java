import java.util.*;
//import java.lang.Math;
// code to find the first duplicate value in an array.

class Main {
// brute force approach - O(n^2)

public static int firstduplicate(int[] a) {
  int minSecondIndex= a.length;
  for(int i = 0; i< a.length; i++) {
     for(int j=i+1; j< a.length; j++) {
       if(a[i] == a[j]) {
            minSecondIndex = Math.min(minSecondIndex, j);
       }
     }
  }
if(minSecondIndex == a.length) return -1;
else return a[minSecondIndex];

}

// Hashset approach - O(n) 
// Hashset approach will take up the space.

public static int firstDuplicateHashSet(int[] a) {
HashSet<Integer> set = new HashSet<>();
for(int i=0; i< a.length; i++) {

  if(set.contains(a[i])) {
     return a[i];
  }
  else {
    set.add(a[i]);
  }
}
   return -1;
}


// Better solution with efficient time and space complexity - O(n)- again

public static int firstDuplicateBetterApproach(int[] a) {

for(int i=0; i< a.length; i++) {
  if(a[Math.abs(a[i]-1)] < 0){
   return Math.abs(a[i]);
  }
  else{
  a[Math.abs(a[i]) -1] = -a[Math.abs(a[i]) -1];
  }

}

return -1;
}

  

  public static void main(String[] args) {
   int[] arr = {2, 1, 3, 5, 3, 2};
   //Sy, stem.out.println(firstduplicate(arr));,
   //System.out.println(firstDuplicateHashSet(arr));
   System.out.println(firstDuplicateBetterApproach(arr));


  }
} 