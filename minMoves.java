import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {
   static class Square { 
        int x, y; 
        int moves; 
  
        public Square(int x, int y, int moves) 
        { 
            this.x = x; 
            this.y = y; 
            this.moves = moves; 
        } 
    } 
    /*
     * Complete the 'minMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER startRow
     *  3. INTEGER startCol
     *  4. INTEGER endRow
     *  5. INTEGER endCol
     */

    public static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {
    // Write your code here
    
            System.out.println(n); //8
            System.out.println(startRow); //7
            System.out.println(startCol); //0
            System.out.println(endRow); //6
                System.out.println(endCol); //1
        
        int posX[] = { -2, -1, 1, 2, -2, -1, 1, 2 }; 
        int posY[] = { -1, -2, -2, -1, 1, 2, 2, 1 }; 
  
      
        List<Square> queue = new LinkedList<>(); 

        queue.add(new Square(startRow, startCol, 0)); 
  
        Square temp; 
        int x, y; 
        boolean visited[][] = new boolean[n + 1][n + 1]; 
  
        
        // for (int i = 1; i <= n; i++) 
        //     for (int j = 1; j <= n; j++) 
                // visited[i][j] = false; 
  

        visited[startRow][startCol] = true; 
  

        while (!queue.isEmpty()) { 
            temp = queue.get(0); 
            queue.remove(0); 
  
  
            if (temp.x == endRow && temp.y == endCol) 
                return temp.moves; 
  
            for (int i = 0; i < posX.length; i++) { 
                x = temp.x + posX[i]; 
                y = temp.y + posY[i]; 
  
                if (isValid(x, y, n) && !visited[x][y]) { 
                    visited[x][y] = true; 
                    queue.add(new Square(x, y, temp.moves + 1)); 
                } 
            } 
        } 
        return -1; 

    }
    
     static boolean isValid(int x, int y, int n) 
    { 
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    
    

}
public class Solution {
