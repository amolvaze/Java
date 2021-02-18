// Input-1: 
// nums = 
// [[1,2],
//  [3,4]]
// r = 1, c = 4
// Output: 
// [[1,2,3,4]]
// Explanation:

// The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.

// Input-2: 
// nums = 
// [[1,2],
//  [3,4]]
// r = 2, c = 4
// Output: 
// [[1,2],
//  [3,4]]
// Explanation:
// There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int rows = nums.length;
        int cols = nums[0].length;
        
        if((rows * cols) != (r*c)) return nums;
        
        int[][] output_arr = new int[r][c];
        int row_num=0;
        int col_num=0;
        
        for(int i=0; i< rows; i++){
            for(int j=0; j< cols; j++){
                output_arr[row_num][col_num] = nums[i][j];
                col_num++;
                if(col_num == c){
                    col_num=0;
                    row_num++;
                }
            }
        }
        
        return output_arr;
    }
}
