// Input: 
// image = [[1,1,1],[1,1,0],[1,0,1]]
// sr = 1, sc = 1, newColor = 2
// Output: [[2,2,2],[2,2,0],[2,0,1]]
// Explanation: 
// From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected 
// by a path of the same color as the starting pixel are colored with the new color.
// Note the bottom corner is not colored 2, because it is not 4-directionally connected
// to the starting pixel.

//DFS approach

// Time Complexity - O(N)
// Space Complexity - O(N)

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;    
    }
    
    public void fill(int[][] image, int sr, int sc, int color, int newColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color){
            return;
        }
        
        image[sr][sc] = newColor;
        fill(image, sr+1, sc, color, newColor);
        fill(image, sr-1, sc, color, newColor);
        fill(image, sr, sc+1, color, newColor);
        fill(image, sr, sc-1, color, newColor);
        
    }
}
