// Code to merge two sorted arrays.
import java.util.*;

class Main {
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int count = m+n-1;
    --m;
    --n;
    while(m>=0 && n>=0)
    {
      if(nums1[m] > nums2[n])
      {
        nums1[count--] = nums1[m--];
      }
      else
      {
        nums1[count--] = nums2[n--];
      }
    }

    while(n>=0)
    {
      nums1[count--] = nums2[n--];
    }
     for(int i=0; i< nums1.length; i++)
     {
       System.out.println(nums1[i]+" ");
     }

   }
  public static void main(String[] args) {
    int[] a1= {1,2,3,0,0,0};
    int[] a2= {2,5,6};
    int m = 3;
    int n =3;
   merge(a1,m,a2,n);

  }
}
