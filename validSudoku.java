// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> seen = new HashSet();
        
        for(int i=0; i< 9; i++){
            for(int j=0; j< 9; j++){
               char current_val = board[i][j];
               if(current_val != '.'){
                   if(!seen.add(current_val + " Found in row " + i)||
                       !seen.add(current_val+ " Found in column " + j) ||
                       !seen.add(current_val + " Found in sub box " +i/3+ " "
+j/3)){
                      return false; 
                   }
                       
               }
            }
        }
        
        return true;
    }
}
