import java.util.*;

// code to find the diameter of a given binary tree

// Time complexity would be O(n) linear time as we are traversing each node and space complexity would be also O(n).

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans =0;
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return ans==0?0:ans-1;
    }
    public int getDiameter(TreeNode root) {
        if(root == null) 
            return 0;
       int left = getDiameter(root.left);
       int right = getDiameter(root.right);
       ans = Math.max(ans, (left+right+1));
       return Math.max(left, right) + 1;
           
    }
}
