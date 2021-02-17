/*
 Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

*/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int low =0;
        int high = A.length-1;
        
        while(low <= high){
            for(int i=0; i < A.length; i++){
            if(A[i][low] == A[i][high]){
             A[i][low] = 1- A[i][low]; // trick to invert 0 to 1 and vice versa
             A[i][high] = A[i][low]; // copy from low to high
            }
        } 
            low++;
            high--;
        }
       
        return A;
    }
}
