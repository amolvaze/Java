class Solution {
    private int row;
    private int col;
    private boolean isfound = false;
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {

        if(board == null || board.length == 0 || word == null || word.isEmpty())
            return false;

        row = board.length;
        col = board[0].length;
        visited = new boolean[row][col];

        for (int i = 0; i <row; i++){
            for (int j = 0; j < col; j++){
                if(board[i][j] == word.charAt(0) && !isfound) {
                    dfs(board, word, i, j, 0);
                }
            }
        }
        return isfound;
    }

    private void dfs(char[][] board, String word, int i, int j, int index){

        if(index >= word.length()){
            isfound = true;
            return;
        }
        
        if(i < 0 || j <0 || i >= row || j >= col || visited[i][j])
            return;

        if(board[i][j] != word.charAt(index))
            return;

        visited[i][j] = true;

        if(!isfound)
            dfs(board, word, i, j+1, index+1);
        
        if(!isfound)
            dfs(board, word, i, j-1, index+1);
        
        if(!isfound)
            dfs(board, word, i+1, j, index+1);
        
        if(!isfound)
            dfs(board, word, i-1, j, index+1);

        visited[i][j] = false;
    }
}
