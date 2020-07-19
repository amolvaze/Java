import java.util.*;

// code to find the no of islands.

// Ex-1
//Input: grid = [
 // ["1","1","1","1","0"],
 // ["1","1","0","1","0"],
 // ["1","1","0","0","0"],
 // ["0","0","0","0","0"]
//]
//Output: 1

//Ex-2
 //Input: grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
 // ["0","0","1","0","0"],
 // ["0","0","0","1","1"]
//]
//Output: 3

class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int count =0;
         
        // loop through given input 
        for(int i=0; i < grid.length; i++) {
            for(int j=0; j< grid[i].length; j++) {
                if(grid[i][j] == '1')
                {
                    count+=1;
                    BFS(grid,i,j);
                }
                
            }
        }
        
        return count;
        
    }
    
    
    public void BFS(char[][] grid, int i, int j) {
        if(i<0 || i >= grid.length || j< 0 || j>= grid[i].length || grid[i][j] == '0') return;
             
             grid[i][j] = '0';
             BFS(grid,i+1,j); // up
             BFS(grid,i-1,j);  // down
             BFS(grid,i,j-1); // left
             BFS(grid,i,j+1);  // right
        
    }
    
}
