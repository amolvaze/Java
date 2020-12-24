class Solution {
    public int islandPerimeter(int[][] grid) {
       if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int result =0;
        for(int i=0; i< grid.length; i++){
            for(int j=0; j < grid[i].length; j++){
                // if all are 1's we add 4
                if(grid[i][j] == 1){
                  result +=4;
                
                
                // left check then we substract 2 the black one we dont need those
                if(i > 0 && grid[i-1][j] == 1){
                    result -=2;
                }
                
                  // right check then we substract 2 the black one we dont need those
                if(j > 0 && grid[i][j-1] == 1){
                    result -=2;
                }
            }
                
            }
        }
        return result;
    }
}
