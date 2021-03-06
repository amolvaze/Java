class Solution {
    public void solve(char[][] board) {
       
        if(board.length == 0 || board[0].length == 0) return;
        
        int rows = board.length;
        int cols = board[0].length;
        
        // loop thru rows and with first and last columns
        for(int i=0; i< rows; i++){
            if(board[i][0] == 'O') boundryDFS(board, i, 0);
            if(board[i][cols-1] == 'O') boundryDFS(board, i, cols-1);
        }
        
        // loop thru columns and with first and last rows
        
        for(int j=0; j < cols; j++){
          if(board[0][j] == 'O') boundryDFS(board, 0, j);
            if(board[rows-1][j] == 'O') boundryDFS(board, rows-1, j);
        }
        
        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                if(board[i][j] == 'O'){
                 board[i][j] = 'X';
                } else if(board[i][j] == '*'){
                 board[i][j] = 'O';
                }
            }
        }
        
    }
    
    public void boundryDFS(char[][] board, int i, int j){
      if(i < 0 || i > board.length-1 || j < 0 || j > board[0].length-1)
          return;
    
        if(board[i][j] == 'O') board[i][j] = '*';
        
        if( i> 0 && board[i-1][j] == 'O')
        {
          boundryDFS(board, i-1, j);  
        }
        
       if( i < board.length-1 && board[i+1][j] == 'O')
        {
          boundryDFS(board, i+1, j);  
        }
        
         if( j > 0 && board[i][j-1] == 'O')
        {
          boundryDFS(board, i, j-1);  
        }
        
        if( j < board[0].length-1 && board[i][j+1] == 'O')
        {
          boundryDFS(board, i, j+1);  
        }
       
        
      return;  
    }
  
}
