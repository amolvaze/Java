import java.util.*;

// code to search in sorted 2D array

class Main {
  public static boolean searchMatrix(int[][] matrix, int target) {
   
   if(matrix.length == 0) return false;
   // calculate rows and colums
   int rows = matrix.length;
   int columns = matrix[0].length;

   // binary search approach
   int left= 0;
   int right = rows*columns-1;

   while(left<=right) {
    // calculate midpoint
   int midpoint = left + (right -left)/2;
   int midpoint_element = matrix[midpoint/columns][midpoint%columns];
   
  if(midpoint_element == target) 
   {
     return true;
   }
  else if(target < midpoint_element)
  { 
    right = midpoint-1;
  }
  else if(target > midpoint_element)
  {
    left = midpoint+1;
  }

   }
   return false;
  }
  public static void main(String[] args) {
    int[][] matrix = {
                 {1,   3,  5,  7},
                 {10, 11, 16, 20},
                {23, 30, 34, 50}
    };
   
    int target=3;

   System.out.println(searchMatrix(matrix, target));
  }
}
