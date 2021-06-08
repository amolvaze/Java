// Code to find the no of visible nodes in the given Binary Tree.
// import java.util.*;

class Solution {
    private static int countVisible(Tree T, int max){
        int visible= 0;
        if(T == null) {
            return 0;
        }
       if (T.x >= max) {
            visible++;
            max = Math.max(T.x, max);
        }
       // Traverse to the left
        visible += countVisible(T.l, max);
        // Traverse to the right
        visible += countVisible(T.r, max);
     return visible;
   }

    public int solution(Tree T) {
       // write your code in Java SE 8
        return countVisible(T, T.x);

    }
}
