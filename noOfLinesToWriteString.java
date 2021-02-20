// Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
// Output: [3,60]
// Explanation: You can write s as follows:
// abcdefghij  // 100 pixels wide
// klmnopqrst  // 100 pixels wide
// uvwxyz      // 60 pixels wide
// There are a total of 3 lines, and the last line is 60 pixels wide.

// Time Complexity: O(S\text{.length})O(S.length), as we iterate through S.

// Space Complexity - O(1) additional space, as we only use lines and width. 
//In Java, our toCharArray method makes this O(S\text{.length})O(S.length), but we could use .charAt instead).

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        int num_lines =1;
        int width =0;
        
        for(char c : s.toCharArray()){
            int char_width = widths[c-'a'];
            if(char_width + width > 100){
                num_lines ++;
                width = 0;
            }
            
            width += char_width;
        }
        
        result[0] = num_lines;
        result[1] = width;
        
        return result;
    }
}
